/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

/**
 * 直接插入排序。
 *
 * 基本思想：
 * 　　把n个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一个元素，无序表中有n-1个元素；
 * 	排序过程即每次从无序表中取出第一个元素，将它插入到有序表中，使之成为新的有序表，重复n-1次完成整个排序过程。
 *
 * @author wung 2019-11-07.
 */
public class InsertSort {
	
	public static void sort(int[] a) {
		if (a == null || a.length <= 1) {
			return;
		}
		
		for (int i = 1; i < a.length; i++) {
			// 待插入无序表的数
			int temp = a[i];
			
			// 寻找 temp 插入有序列表的正确位置
			// 相当于从后向前遍历有序表，如果有序表的当前数大于 temp，则将该数忘后移动一个位置，给 temp 腾位置
			int j = i - 1;
			for (; j >= 0 && a[j] > temp; j--) {
				// 元素后移，为插入temp做准备
				a[j+1] = a[j];
			}
			// 插入temp
			a[j + 1] = temp;
		}
	}
	
}
