/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.linkedlist;

/**
 * 单链表节点。
 *
 * @author wung 2019-10-31.
 */
public class Node {
	
	private String content;
	
	private Node next;
	
	public Node() {
	
	}
	
	public Node(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
