/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.tree;

import com.wung.alghub.base.tree.TraverseBinaryTree;
import com.wung.alghub.base.tree.TreeNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author wung 2019-11-01.
 */
public class TraverseBinaryTreeTest {
	
	private static TreeNode root = null;
	
	@BeforeClass
	public static void init() {
		root = new TreeNode("A");
		TreeNode b = new TreeNode("B");
		TreeNode c = new TreeNode("C");
		TreeNode d = new TreeNode("D");
		TreeNode e = new TreeNode("E");
		TreeNode f = new TreeNode("F");
		TreeNode g = new TreeNode("G");
		TreeNode h = new TreeNode("H");
		TreeNode k = new TreeNode("K");
		
		root.setLeft(b);
		root.setRight(e);
		b.setRight(c);
		c.setLeft(d);
		e.setRight(f);
		f.setLeft(g);
		g.setLeft(h);
		g.setRight(k);
	}
	
	@Test
	public void giveNullTreeThenReturnEmpty() {
		assert TraverseBinaryTree.preOrder(null).equals("");
		assert TraverseBinaryTree.middleOrder(null).equals("");
		assert TraverseBinaryTree.postOrder(null).equals("");
	}
	
	@Test
	public void preOrder() {
		String result = TraverseBinaryTree.preOrder(root);
		System.out.println(result);
		assert result.equals("ABCDEFGHK");
	}
	
	@Test
	public void postOrder() {
		String result = TraverseBinaryTree.postOrder(root);
		System.out.println(result);
		assert result.equals("DCBHKGFEA");
	}
	
	
	
}
