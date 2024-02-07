package com.arrays;

import java.util.Arrays;

public class NegativePositive {
	// at the end : negative
	static void shiftNegative(int ar[]) {
		int left = 0;
		int right = ar.length;
		while (left < right) {
			while (ar[left] > 0 && left < right)
				left++;
			while (ar[right] < 0 && left > right)
				right++;
			if (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
	}

	static void shiftNegative2(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < 0 && i < j) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, -2, 7, -4, 5, -1, 9 };
		System.out.println(Arrays.toString(arr));
		shiftNegative2(arr);
		System.out.println(Arrays.toString(arr));

	}

}
