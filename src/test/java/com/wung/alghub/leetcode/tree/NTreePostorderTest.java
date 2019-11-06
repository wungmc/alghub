/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wung 2019-11-06.
 */
public class NTreePostorderTest {
	
	NTreeNode root = null;
	
	@Before
	public void init() {
		root = new NTreeNode(1);
		
		List<NTreeNode> children = new ArrayList<>();
		NTreeNode chi1 = new NTreeNode(3);
		NTreeNode chi2 = new NTreeNode(2);
		NTreeNode chi3 = new NTreeNode(4);
		children.add(chi1);
		children.add(chi2);
		children.add(chi3);
		root.children = children;
		
		List<NTreeNode> children2 = new ArrayList<>();
		NTreeNode chi4 = new NTreeNode(5);
		NTreeNode chi5 = new NTreeNode(6);
		children2.add(chi4);
		children2.add(chi5);
		chi1.children  = children2;
		
		//    1
		// 3  2  4
	   // 5 6
		
	}
	
	@Test
	public void recursionPostorder() {
		List<Integer> list = NTreePostorder.recursionPostorder(root);
		System.out.println(list);
		assert list.toString().equals("[5, 6, 3, 2, 4, 1]");
	}
	
	@Test
	public void iterationPostOrder() {
		List<Integer> list = NTreePostorder.iterationPostOrder(root);
		System.out.println(list);
		assert list.toString().equals("[5, 6, 3, 2, 4, 1]");
	}
	
}
