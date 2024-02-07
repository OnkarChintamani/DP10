package com.intermeditetask;

import java.util.Arrays;
//1>> WAP to half sort the array in ascending and half in descending
public class SortHalf {
	static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = i + 1; j < arr.length/2; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			
		}
		int mid=arr.length/2;
		for (int i = mid; i < arr.length-1; i++) {
			for (int j =mid; j < arr.length-i+mid-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 5, 4, 7, 1, 9 };
		sortArray(arr);
	}

}
