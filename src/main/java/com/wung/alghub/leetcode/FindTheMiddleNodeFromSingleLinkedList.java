/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode;

/**
 *
 * 查找单链表的中间结点。
 *
 * 设置两个指针first和second，
 * 只不过这里是，两个指针同时向前走，second指针每次走两步，first指针每次走一步，
 * 直到second指针走到最后一个结点时，此时first指针所指的结点就是中间结点。
 * 注意链表为空，链表结点个数为1和2的情况。时间复杂度为O（n）。
 *
 * @author wung 2019-11-01.
 */
public class FindTheMiddleNodeFromSingleLinkedList {
	
	public static Node findTheMiddleNode(Node head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		
		Node first = head;
		Node second = head;
		
		while (second != null && second.getNext() != null) {
			first = first.getNext();
			second = second.getNext().getNext();
		}
		
		return first;
	}
}
