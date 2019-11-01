/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wung 2019-11-01.
 */
public class BubbleSortTest {
	
	@Test
	public void bubbleSort() {
		int[] arr = {5, 1, 4, 2, 8};
		System.out.println("before sort:" + Arrays.toString(arr));
		BubbleSort.sort(arr);
		System.out.println("after sort:" + Arrays.toString(arr));
	}
	
	
	@Test
	public void giveOneElement() {
		int[] arr = {5};
		System.out.println("before sort:" + Arrays.toString(arr));
		BubbleSort.sort(arr);
		System.out.println("after sort:" + Arrays.toString(arr));
	}
	
	
}
