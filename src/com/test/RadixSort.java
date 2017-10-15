package com.test;
/**
 * 基数排序
 * @author iiip
 *
 */
public class RadixSort {

	/**
	 * 基数排序
	 * @param arr 数组
	 * @param n 数组
	 * @param d 元素中最大的位数
	 */
	public static void radixSort(int[] arr, int n, int d){
		int length = n;
		int[][] bucket = new int[10][length];
		int disover = 1;//从1 10 100 ...
		int[] count = new int[10];//对应桶的个数
		
		for (int i = 1; i <= d; i++){
			for (int j = 0; j < n; j++){//遍历arr
				int digit = (arr[j] / disover)%10;
				bucket[digit][count[digit]++]=arr[j];
			}
			
			int k = 0;
			for (int m = 0; m < 10; m++){
				if (count[m]==0){
					continue;
				}else{
					for (int p = 0;p < count[m];p++){
						arr[k++]=bucket[m][p];
					}
					count[m]=0;
				}
			}
			disover *= 10;
		}
		
	}
	
	public static void printArr(int[] arr){
		for (int i : arr){
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
        int[] data = new int[] { 1100, 1921, 2212, 12, 23 };  
        printArr(data);  
        radixSort(data, 5, 4);  
        System.out.println("排序后的数组：");  
        printArr(data);  
	}
	
}
