package com.test;

public class TestRadixSort {
	// 各位装通法
	public static int[] radixSort(int[] A, int n, int d) {//d关键字的最大位数
		int length = n;//个数
		int divisor = 1;// 定义每一轮的除数，1,10,100...
		int[][] bucket = new int[10][length];// 定义了10个桶，以防每一位都一样全部放入一个桶中
		int[] count = new int[10];// 统计每个桶中实际存放的元素个数
		int digit;// 获取元素中对应位上的数字，即装入那个桶
		for (int i = 1; i <= d; i++) {// 经过d次装通操作，排序完成
			for (int temp : A) {// 计算入桶
				digit = (temp / divisor) % 10;
				bucket[digit][count[digit]++] = temp;
			}
			int k = 0;// 被排序数组的下标
			for (int b = 0; b < 10; b++) {// 从0到9号桶按照顺序取出
				if (count[b] == 0)// 如果这个桶中没有元素放入，那么跳过
					continue;
				for (int w = 0; w < count[b]; w++) {
					A[k++] = bucket[b][w];
				}
				count[b] = 0;// 桶中的元素已经全部取出，计数器归零
			}
			divisor *= 10;
		}
		return A;
	}
    public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");  
        }
        System.out.println();  
    }  
	public static void main(String[] args) {  
        int[] data = new int[] { 1100, 192, 221, 12, 23 };  
        print(data);  
        radixSort(data, 5, 4);  
        System.out.println("排序后的数组：");  
        print(data);  
    }  
}