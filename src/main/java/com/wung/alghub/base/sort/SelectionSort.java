/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

/**
 * 选择排序。
 *
 * 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；
 * 第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arr[1]交换；
 * 第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与arr[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 *
 * @author wung 2019-11-07.
 */
public class SelectionSort {

	public static void sort(int[] a) {
		if (a == null || a.length <= 1) {
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			// 剩下的数据中找到最小值
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			
			// 交换位置，将最小值放到最左边
			if (i != k) {
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
}
