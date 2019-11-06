/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.tree;

import java.util.List;

/**
 * N叉树的节点
 *
 * @author wung 2019-11-06.
 */
public class NTreeNode {
	public int val;
	public List<NTreeNode> children;
	
	public NTreeNode() {}
	
	public NTreeNode(int val) {
		this.val = val;
	}
	
	public NTreeNode(int _val, List<NTreeNode> _children) {
		val = _val;
		children = _children;
	}
	
}
