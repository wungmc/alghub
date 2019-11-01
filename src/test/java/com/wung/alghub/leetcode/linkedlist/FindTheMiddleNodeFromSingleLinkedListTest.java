/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.linkedlist;

import com.wung.alghub.leetcode.linkedlist.FindTheMiddleNodeFromSingleLinkedList;
import com.wung.alghub.leetcode.linkedlist.Node;
import org.junit.Test;

/**
 * @author wung 2019-11-01.
 */
public class FindTheMiddleNodeFromSingleLinkedListTest {

	@Test
	public void givenNullOrSingleNodeThenReturnSelf() {
		Node head = null;
		assert FindTheMiddleNodeFromSingleLinkedList.findTheMiddleNode(head) == head;
		
		head = new Node();
		assert FindTheMiddleNodeFromSingleLinkedList.findTheMiddleNode(head) == head;
		
	}
	
	@Test
	public void givenMultiNodeThenReturnTheMiddleNode() {
		Node head = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		assert FindTheMiddleNodeFromSingleLinkedList.findTheMiddleNode(head) == node3;
	}
	
}
