package com.basic;

import java.util.Arrays;

public class AlternateElement {
	static void alternateElement(int[] arr) {
		for (int i = 0; i < arr.length; i+=2) {
		System.out.println(arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		alternateElement(arr);
		System.out.println(Arrays.toString(arr));
	}

}
