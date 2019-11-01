/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.linkedlist;

import com.wung.alghub.leetcode.linkedlist.Node;
import com.wung.alghub.leetcode.linkedlist.ReverseLinkedList;
import org.junit.Test;

/**
 * @author wung 2019-10-31.
 */
public class ReverseLinkedListTest {
	
	@Test
	public void giveNullListThenReturnNull() {
		
		Node head = null;
		Node reverseList = ReverseLinkedList.reverse(head);
		assert reverseList == null;
		assert ReverseLinkedList.joinContent(head) == null;
	}
	
	@Test
	public void giveSingleNodeListThenReturnSelf() {
		Node head = new Node();
		Node reverseList = ReverseLinkedList.reverse(head);
		assert reverseList == head;
		assert ReverseLinkedList.joinContent(head).equals("");
	}
	
	@Test
	public void giveMultiNodeListThenReturnReverseList() {
		Node head = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		
		head.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		assert ReverseLinkedList.joinContent(head).equals("abcd");
		
		Node reverseList = ReverseLinkedList.reverse(head);
		assert ReverseLinkedList.joinContent(reverseList).equals("dcba");
		
	}
	
}
