/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 559: N叉树的最大深度。
 *
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 * 我们应返回其最大深度，3。
 *
 *
 * @author wung 2019-11-07.
 */
public class NTreeMaxHeight {
	
	public static int maxDepth(NTreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.children == null) {
			return 1;
		}
		
		List<Integer> heights = new LinkedList<>();
		for (NTreeNode node : root.children) {
			heights.add(maxDepth(node));
		}
		return Collections.max(heights) + 1;
		
		// 或者
		// int max = 0;
		// for (NTreeNode node : root.children) {
		// 	max = Math.max(maxDepth(node), max);
		// }
		// return max + 1;
	}
}
