package com.basic;

import java.util.Arrays;

public class Sort {
	static void sortArray(int[] arr) {
		int temp = 0;
		 
		for (int i = 0; i < arr.length; i++) {
			temp=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]>arr[temp])
					temp=j;
					
			}
			int temp1=arr[i];
			arr[i]=arr[temp];
			arr[temp]=temp1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[]= {29,54,84,56,78};
		sortArray(arr);
	}

}
