/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.linkedlist;

/**
 *
 * 查找单链表中的倒数第k个结点。
 *
 * 需要声明两个指针：即两个结点型的变量first和second，
 * 首先让first和second都指向第一个结点，
 * 然后让second结点往后挪k-1个位置，此时first和second就间隔了k-1个位置，
 * 然后整体向后移动这两个节点指针，直到second节点走到最后一个结点的时候，
 * 此时first节点所指向的位置就是倒数第k个节点的位置。时间复杂度为O（n）。
 *
 * @author wung 2019-11-01.
 */
public class FindTheKNodeFromLast {

	public static Node findKFromLast(Node head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		
		Node first = head;
		Node second = head;
		
		// second 指针先向后移动 k-1 个节点
		for (int i = 0; i < k - 1; i ++) {
			second = second.getNext();
			if (second == null) {
				// 说明链表的长度小于 k
				return null;
			}
		}
		
		// fist 和 second 同时向后移动，直到second移动到最后一个节点，此刻 fist 指向的就是倒数第 k 个节点
		while (second.getNext() != null) {
			first = first.getNext();
			second = second.getNext();
		}
		return first;
	}

}
