/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode;

/**
 * 反转单向链表。
 *
 * 例如链表：
 * 　　1->2->3->4
 * 反转之后：
 * 　　4->3->2->1
 *
 * 思路：从头到尾遍历原链表，每遍历一个结点，将其摘下放在新链表的最前端。注意链表为空和只有一个结点的情况。时间复杂度为O（n）
 *
 * @author wung 2019-10-31.
 */
public class ReverseLinkedList {
	
	public static Node reverse(Node head) {
		if (head == null) {
			return null;
		}
		if (head.getNext() == null) {
			return head;
		}
		
		Node current = head;
		Node next = null;
		Node reverseNode = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(reverseNode);
			reverseNode = current;
			
			current = next;
			
			System.out.println(reverseNode.getContent());
		}
		
		return reverseNode;
	}
	
	public static String joinContent(Node head) {
		if (head == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current.getContent() == null ? "" : current.getContent());
			current = current.getNext();
		}
		return sb.toString();
	}
	
}
