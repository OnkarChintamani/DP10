package com.basic;

import java.util.Arrays;

public class Addition {
	static void additionOfArray(int[] arr, int[] arr1) {
		int sum;
		int sum1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + arr1[i];
			sum1[i] = sum;
			//System.out.println(sum);
		}
		System.out.println("Sum of array is :" + Arrays.toString(sum1));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 8 };
		int[] arr1 = { 3, 4, 5, 1, 8 };
		additionOfArray(arr, arr1);
	}

}
