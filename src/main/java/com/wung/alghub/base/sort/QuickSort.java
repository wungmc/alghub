package com.wung.alghub.base.sort;

/**
 * 快速排序
 *
 * 原理：
 * 基于分治的思想，是冒泡排序的改进型。
 * 首先在数组中选择一个基准点（该基准点的选取可能影响快速排序的效率，后面讲解选取的方法），
 * 然后分别从数组的两端扫描数组，设两个指示标志（lo指向起始位置，hi指向末尾)，
 * 首先从后半部分开始，如果发现有元素比该基准点的值小，就交换lo和hi位置的值，
 * 然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换lo和hi位置的值，
 * 如此往复循环，直到lo>=hi,然后把基准点的值放到hi这个位置。一次排序就完成了。
 * 以后采用递归的方式分别对前半部分和后半部分排序，当前半部分和后半部分均有序时该数组就自然有序了。
 *
 * http://www.cnblogs.com/kkun/archive/2011/11/23/2260270.html
 * http://bubkoo.com/2014/01/12/sort-algorithm/quick-sort/
 * https://www.jianshu.com/p/e4369c66d4a5
 *
 * Created by wung on 2017/2/25.
 */
public class QuickSort {

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] > pivot) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
    
	public static void sort(int[] arr, int low, int high) {
		if (arr.length <= 1) {
			return;
		}
		
		if (low < high) {
			int loc = partition(arr, low, high);
			sort(arr, low, loc - 1);
			sort(arr, loc + 1, high);
		}
	}
	
}
