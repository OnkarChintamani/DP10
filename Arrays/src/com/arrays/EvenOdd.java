package com.arrays;

import java.util.Arrays;

public class EvenOdd {
	static void findEven(int arr[]) {
		int even[] = new int[arr.length];
		int odd[] = new int[arr.length];
		int index1 = 0, index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even[index1++] = arr[i];
			else
				odd[index2++] = arr[i];
		}
		System.out.println("Even" + Arrays.toString(even));
		System.out.println("odd" + Arrays.toString(odd));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 6, 5, 8, 9 };
		findEven(arr);
	}

}
