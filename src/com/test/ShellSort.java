package com.test;

/**
 * 希尔排序 http://www.cnblogs.com/hithlb/p/3598993.html
 * 
 * @author iiip
 * 
 */
public class ShellSort {

	public static void shellSort(int[] arr) {
		int increaseNum = arr.length / 2;// 增量
		while (increaseNum >= 1) {
			// 进行插入排序
			for (int i = 0; i < arr.length - increaseNum; i++) {
				// i < arr.length - increaseNum因为下一个就可以到达尾部arr[i] > arr[i +
				// increaseNum]
				if (arr[i] > arr[i + increaseNum]) {
					int temp = arr[i];
					arr[i] = arr[i + increaseNum];
					arr[i + increaseNum] = temp;
				}
			}
			// 设置新的增量
			increaseNum = increaseNum / 2;
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
		shellSort(data);
		System.out.println("\n排序后的数组：");
		printArr(data);
	}

}
