package com.test;

public class InsertSort {
	public static void insertSort(int[] arr)
	{
	    int i, j;
	    int n = arr.length;
	    int target;
	 
	    //假定第一个元素被放到了正确的位置上
	    //这样，仅需遍历1 - n-1
	    for (i = 1; i < n; i++)
	    {
	        j = i;
	        target = arr[i];
	 
	        while (j > 0 && target < arr[j - 1])
	        {
	            arr[j] = arr[j - 1];
	            j--;
	        }
	 
	        arr[j] = target;
	    }
	}
	public static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int[] data = new int[] { 4, 8, 2, 1, 3 };
		printArr(data);
		insertSort(data);
		System.out.println("\n排序后的数组：");
		printArr(data);
	}
}
