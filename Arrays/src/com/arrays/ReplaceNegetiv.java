package com.arrays;

import java.util.Arrays;

public class ReplaceNegetiv {
	static void replaceNegative(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 33, -11, 49, -70, 15, -80, -63 };
		replaceNegative(arr);
	}

}
