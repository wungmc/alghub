/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode;

/**
 * 771: 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 *
 *
 * @author wung 2019-11-05.
 */
public class JewelsAndStones {
	
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
		
	}
	
	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		char[] o = S.toCharArray();
		char[] t = J.toCharArray();
		for (int i = 0; i < o.length; i++) {
			for (int j = 0; j < t.length; j++) {
				if (o[i] == t[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
}