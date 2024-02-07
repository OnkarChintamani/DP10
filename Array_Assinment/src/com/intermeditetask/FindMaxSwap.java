package com.intermeditetask;

import java.util.Arrays;
//1> Find the max and minimum number from an array and swap their positions
public class FindMaxSwap {
	static void findMax(int[] ar) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > ar[max])
				max = i;
			if (ar[i] < ar[min])
				max = i;
		}
		int temp;
		if (max != min) {
			temp = ar[min];
			ar[min] = ar[max];
			ar[max] = temp;
		}
		System.out.println(Arrays.toString(ar));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));

		findMax(arr);
	}

}
