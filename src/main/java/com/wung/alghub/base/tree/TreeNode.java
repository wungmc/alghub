/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.tree;

/**
 * @author wung 2019-11-01.
 */
public class TreeNode {
	
	private String content;
	
	private TreeNode left;
	
	private TreeNode right;
	
	public TreeNode() {}
	
	public TreeNode(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
}
