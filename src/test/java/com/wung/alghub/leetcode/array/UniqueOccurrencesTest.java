/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode.array;

import org.junit.Test;

/**
 * @author wung 2019-11-08.
 */
public class UniqueOccurrencesTest {
	
	@Test
	public void uniqueOccurrences() {
		int[] arr1 = {1,2,2,1,1,3};
		int[] arr2 = {1,2};
		int[] arr3 = {-3,0,1,-3,1,1,1,-3,10,0};
		assert UniqueOccurrences.uniqueOccurrences(arr1);
		assert !UniqueOccurrences.uniqueOccurrences(arr2);
		assert UniqueOccurrences.uniqueOccurrences(arr3);
	}
	
}
