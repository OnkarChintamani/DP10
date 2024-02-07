package com.basic;

import java.util.Arrays;

public class CubeArray {
	static void findCube(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,2,8,4,6,9};
		findCube(arr);
	}

}
