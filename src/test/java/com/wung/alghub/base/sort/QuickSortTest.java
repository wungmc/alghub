/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wung 2019-11-02.
 */
public class QuickSortTest {

    private int[] arr = null;
    private int[] arr2 = null;

    @Before
    public void init() {
        arr = new int[] { 6, 2, 4, 1, 5, 9 };
        arr2 = new int[] { 1, 6, 8, 7, 3, 5, 16, 4, 8, 36, 13, 44 };
    }

    @Test
    public void sort() {
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        QuickSort.sort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void sort2() {
        QuickSort2.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
        QuickSort2.sort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

    }

}
