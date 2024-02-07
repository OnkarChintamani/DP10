package com.basic;

import java.util.Arrays;

public class AddElement {
	static void addElemen(int[] arr,int index,int add) {
		for (int i = 0; i < arr.length; i++) {
			if(i==index)
				arr[i]=add;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,4,5,6,7};
		addElemen(arr, 2, 10);
	}

}
