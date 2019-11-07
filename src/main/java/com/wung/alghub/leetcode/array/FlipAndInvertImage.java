/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.array;

import java.util.Arrays;

/**
 * 832：反转图像
 *
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 *
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 *
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * 示例 1:
 *
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 *
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flipping-an-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wung 2019-11-06.
 */
public class FlipAndInvertImage {
	
	public static void main(String[] args) {
		int[][] A = {{1,1,0}, {1,0,1}, {0,0,0}};
		int[][] B = flipAndInvertImage(A);
		printlnArray(B);
		
		A = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		B = flipAndInvertImage(A);
		printlnArray(B);
	}
	
	public static int[][] flipAndInvertImage(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			// 注意不要少了等于号： j<= k
			for (int j = 0, k = a[i].length - 1; j <= k; j++, k--) {
				int temp = a[i][j];
				// 注意：使用异或进行取反
				a[i][j] = (a[i][k] ^ 1);
				a[i][k] = temp ^ 1;
			}
		}
		
		return a;
	}
	
	private static void printlnArray(int[][] a) {
		for (int[] i : a) {
			System.out.println(Arrays.toString(i));
		}
	}
}
