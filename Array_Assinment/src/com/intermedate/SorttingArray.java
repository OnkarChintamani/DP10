package com.intermedate;

import java.util.Arrays;

public class SorttingArray {
	static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,5,3,1,4,6,0};
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(arr));
		sortArray(arr);
		System.out.println("Affter Sorting :");
		System.out.println(Arrays.toString(arr));
		
	}

}
