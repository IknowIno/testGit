package com.qianyier.test01;

public class test01 {
	public static void main(String[] args) {
		int[] arr01 = { 12, 32, 7, 10, 9, 22, 8, 44,5,46,43,17,13,24};
		//quickSort(arr01, 0, arr01.length - 1);
		
		int k = arr01.length;
		betterQuickSort(arr01,0,arr01.length-1,(int)Math.sqrt(k));
		insertSort(arr01,1,arr01.length-1);
		
		
		for (int i = 0; i <= arr01.length - 1; i++) {
			System.out.print(arr01[i] + " ");
		}

	}

	public static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int i, j;
			int key = arr[left];
			i = left;
			j = right;
			while (i < j) {
				while (arr[j] >= key && i < j)
					j--;
				arr[i] = arr[j];
				while (arr[i] <= key && i < j)
					i++;
				arr[j] = arr[i];
			}
			arr[i] = key;
			quickSort(arr, left, i - 1);
			quickSort(arr, j + 1, right);
		}
	}

	public static void insertSort(int arr[], int left, int right) {
		for (int i = left; i < right; i++) {
			int j, key = arr[i];
			for (j = i - 1; arr[j] > key; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}
	}

	public static void betterQuickSort(int arr[], int left, int right, int k) {
		if (left < right) {
			if (right - left <= k) {
				return;
			}
			int i, j;
			int key = arr[left];
			i = left;
			j = right;
			while (i < j) {
				while (arr[j] >= key && i < j)
					j--;
				arr[i] = arr[j];
				while (arr[i] <= key && i < j)
					i++;
				arr[j] = arr[i];
			}
			arr[i] = key;
			betterQuickSort(arr, left, i - 1, k);
			betterQuickSort(arr, j + 1, right, k);
		}
	}

}
