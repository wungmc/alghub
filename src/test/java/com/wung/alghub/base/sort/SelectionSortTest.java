/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wung 2019-11-07.
 */
public class SelectionSortTest {
	
	@Test
	public void sort() {
		int[] arr = new int[] { 6, 2, 4, 1, 5, 9 };
		int[] arr2 = new int[] { 1, 6, 8, 7, 3, 5, 16, 4, 8, 36, 13, 44 };
		
		SelectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		SelectionSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	
}
