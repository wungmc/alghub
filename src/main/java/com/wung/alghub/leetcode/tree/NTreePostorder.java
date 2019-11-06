/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.tree;

import java.util.*;

/**
 * 590：给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * @author wung 2019-11-06.
 */
public class NTreePostorder {
	
	/**
	 * 递归法（最简单）
	 *
	 * @param root
	 * @return
	 */
	public static List<Integer> recursionPostorder(NTreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<Integer> list = new ArrayList<>();
		if (root.children != null) {
			for (NTreeNode node : root.children) {
				list.addAll(recursionPostorder(node));
			}
		}
		list.add(root.val);
		return list;
	}
	
	/**
	 * 迭代法：利用栈，先将根入栈，然后出栈，将子节点顺序入栈。
	 * 比如，根为u，子节点顺序为 v1,v2,v3, 后序遍历结果是：v1,v2,v3,u
	 * 利用栈时，子节点入栈顺序为 v1,v2,v3, 访问结果为 v3,v2,v1, 在这之前先访问根，最终访问顺序是：u,v3,v2,v1,
	 * 把这个结果反转即可。
	 *
	 * @param root
	 * @return
	 */
	public static List<Integer> iterationPostOrder(NTreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		
		Stack<NTreeNode> stack = new Stack<>();
		LinkedList<Integer> list = new LinkedList<>();
		
		stack.push(root);
		while (!stack.empty()) {
			NTreeNode node = stack.pop();
			// 每次都放到链表的表头，实现反转
			list.addFirst(node.val);
			if (node.children != null) {
				for (NTreeNode treeNode : node.children) {
					stack.push(treeNode);
				}
			}
		}
		return list;
	}
	
}
