/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.tree;

/**
 * 二叉树的三种遍历方式：先序、中序、后序。
 *
 * 先、中、后都是相对于跟节点来说的。
 *
 * @author wung 2019-11-01.
 */
public class TraverseBinaryTree {
	
	/**
	 * 先序遍历
	 *
	 * @param root
	 */
 	public static String preOrder(TreeNode root) {
 		if (root == null) {
 			return "";
		}
 		
 		
 		StringBuilder result = new StringBuilder(root.getContent() != null ? root.getContent() : "");
	  
		result.append(preOrder(root.getLeft()));
 		result.append(preOrder(root.getRight()));
 		return result.toString();
	}
	
	/**
	 * 中序遍历
	 *
	 * @param root
	 */
 	public static String middleOrder(TreeNode root) {
 		if (root == null) {
			return "";
		}
 	
		StringBuilder result = new StringBuilder();
	 
		result.append(middleOrder(root.getLeft()));
		result.append(root.getContent() != null ? root.getContent() : "");
		result.append(middleOrder(root.getRight()));
		return result.toString();
	}
	
	/**
	 * 后序遍历
	 *
	 * @param root
	 */
 	public static String postOrder(TreeNode root) {
		if (root == null) {
			return "";
		}
	 
		StringBuilder result = new StringBuilder();
	 
		result.append(postOrder(root.getLeft()));
		result.append(postOrder(root.getRight()));
		result.append(root.getContent() != null ? root.getContent() : "");
		return result.toString();
	 
	}
	
	
}
