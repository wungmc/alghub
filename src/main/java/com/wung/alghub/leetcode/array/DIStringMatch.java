/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.array;

import java.util.Arrays;

/**
 * 942：增减字符串匹配
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 *
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 *
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 * 示例 1：
 *
 * 输出："IDID"
 * 输出：[0,4,1,3,2]
 * 示例 2：
 *
 * 输出："III"
 * 输出：[0,1,2,3]
 * 示例 3：
 *
 * 输出："DDI"
 * 输出：[3,2,0,1]
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author wung 2019-11-06.
 */
public class DIStringMatch {
	
	public static void main(String[] args) {
		int[] arr1 = diStringMatch("IDID");
		assert Arrays.toString(arr1).equals("[0,4,1,3,2]");
		
		int[] arr2 = diStringMatch("III");
		assert Arrays.toString(arr2).equals("[0,1,2,3]");
		
		int[] arr3 = diStringMatch("DDI");
		assert Arrays.toString(arr3).equals("[3,2,0,1]");
		
	}
	
	public static int[] diStringMatch(String s) {
		int N = s.length();
		// 维护一段下标 [0, 1, ..., N]
		int low = 0;
		int high = N;
		int[] arr = new int[N + 1];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				// 如果是 I，则将维护的下标里的最小值放到数组里，这样下标范围就变为 [1, ..., N]
				// 后面无论放什么值都会大于该最小值，满足I后面增大
				arr[i] = low++;
			}
			else {
				// 如果是 D，则将维护的下标里的最大值放到数组里，这样下标范围就变为 [0, ..., N-1]
				// 后面无论放什么值都会小于该最大值，满足D后面减小
				arr[i] = high--;
			}
		}
		return arr;
	}
}
