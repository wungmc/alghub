/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode;

import org.junit.Test;

/**
 * @author wung 2019-11-01.
 */
public class FindTheKNodeFromLastTest {
	
	@Test
	public void givenNullLinkedListThenReturnNull() {
		int k = 3;
		Node head = null;
		Node node = FindTheKNodeFromLast.findKFromLast(head, k);
		assert node == null;
	}
	
	
	@Test
	public void givenZeroKThenReturnNull() {
		int k = 0;
		Node head = null;
		Node node = FindTheKNodeFromLast.findKFromLast(head, k);
		assert node == null;
	}
	
	@Test
	public void giveKGtLinkeListLengthThenReturnNull() {
		Node head = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		int k = 5;
		Node kNode = FindTheKNodeFromLast.findKFromLast(head, k);
		assert kNode == null;
	}
	
	@Test
	public void giveKLtNodeListThenReturnKNode() {
		Node head = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		int k = 3;
		Node kNode = FindTheKNodeFromLast.findKFromLast(head, k);
		assert kNode.getContent().equals("b");
	}
	
	@Test
	public void giveKEqNodeListThenReturnFirstNode() {
		Node head = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		int k = 4;
		Node kNode = FindTheKNodeFromLast.findKFromLast(head, k);
		assert kNode.getContent().equals("a");
	}
	
}
