/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.base.sort;

/**
 *
 * 重写一遍，加深印象。
 *
 * 这篇文章里说的填坑比喻比较好理解：https://www.jianshu.com/p/e4369c66d4a5
 * 首先选择第一个位置为基准点，记录下其值，然后这个第一个位置就相当于一个坑，可以把比基准点小的值填到这里，这也是为什么从右侧开始扫描；
 * 右侧扫描到比基准点小的数后，把这个数填到坑位，
 * 这时，这个数原来所在的位置又变成了新坑位，因为坑位在右侧，需要找个比基准点大的数填到这里， 所以又开始从左侧扫描。。。
 * 循环，直到 low >= high， 一遍循环结束，此刻，比基准点小的数都在左边，比基准点大的数都在右边。
 * 然后递归处理左侧和右侧。
 *
 *
 * bug: 数组中有重复的数字时，会一直循环停不下来。
 *
 * @author wung 2019-11-02.
 */
public class QuickSort2 {

    public static void sort(int[] arr, int low, int high) {
    	if (arr.length <= 1) {
    		return;
		}
    	if (low >= high) {
    		return;
		}
	
		// 将第0个位置的数作为基准点，用 pivot 记录下这个数，这时arr[low]的位子是坑位，可以填其他数
		int pivot = arr[low];
    	int left = low;
    	int right = high;
		while (left < right) {
			// 因为一开始坑位在左侧，需要找一个比基准点小的数填到坑位处，所以要先从右侧扫描
			// 如果右侧的数大于基准点，则将 right 左移
			while (left < right && arr[right] > pivot) {
				right--;
			}
			// 找到比基准点小的数后，将该数填到坑位处
			arr[left] = arr[right];
		
			// 此时，right 的位置变成了新的坑位，因为在右侧，需要一个比基准点小的数填，所以要从左侧扫描找
			// 如果左侧的数小于或等于（注意：等于如果不写，可能会造成死循环）基准点，则将 left 向右移
			while (left < right && arr[left] <= pivot) {
				left++;
			}
			// 找到比基准点大的数后，将该数填到新坑位处
			arr[right] = arr[left];
		}
	
		// 将基准点的数放到最后的那个坑位
		arr[left] = pivot;
  
		// 递归处理左侧
		sort(arr, low, left - 1);
		// 递归处理右侧
		sort(arr, left + 1, high);
		
    }
}
