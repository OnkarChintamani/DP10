package com.basic;

import java.util.Arrays;

public class ReverseArray {
static void reverseArray(int[] arr) {
	int j=arr.length-1; int temp;

	for (int i = 0; i < arr.length/2; i++) {
		
		 temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		 
		 j--;
		
	}
	System.out.println(Arrays.toString(arr));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		reverseArray(arr);
		
	}

}
