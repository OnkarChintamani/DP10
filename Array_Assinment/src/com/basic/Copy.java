package com.basic;

import java.util.Arrays;

public class Copy {
	static void copy(int[] arr) {
		int copy[]=new int[arr.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i]=arr[i];
		}
		System.out.println("copy :"+Arrays.toString(copy));
	}
	public static void main(String[] args) {
		int [] arr= {1,6,8,4,9,10};
		System.out.println("orignal :"+Arrays.toString(arr));
		copy(arr);

	}

}
