package com.test;

import java.util.Arrays;

/**
 * 归并排序
 * @author iiip
 *
 */

public class MegerSort {
	
	public static void  meger(int[] arr, int low, int mid, int high){
		int i = low;//左边
		int j = mid+1;//右边
		int k = 0;
		int[] temp =new int[high - low + 1];
		while(i<=mid && j <= high){
			if (arr[i] < arr[j]){
				temp[k++]=arr[i++];
			}else{
				temp[k++]=arr[j++];
			}
		}
		while(i <= mid){
			temp[k++]=arr[i++];
		}
		while(j <= high){
			temp[k++]=arr[j++];
		}
		
		for (int m = 0;  m < temp.length;m++){
			arr[low+m]=temp[m];
		}
	}
	public static void megerSort(int[] arr, int low, int high){
		if (low >= high){
			return;
		}else{
			int mid = (low+high)/2;
			megerSort(arr, low, mid);
			megerSort(arr, mid+1, high);
			meger(arr, low, mid, high);
		}
	}
	
	
	public static void main(String[] args) {
		int a[] = {3,6,2,1,1, 4,3 };
		megerSort(a, 0, a.length-1);
		System.out.println("排序结果：" + Arrays.toString(a));
		
	}
	
	
}
