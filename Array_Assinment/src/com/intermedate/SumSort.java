package com.intermedate;

public class SumSort {
	static void sort(int[] arr) {
		for (int i = 0; i <=arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==8) {
					System.out.println(arr[i]+" "+arr[j]);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {2,3,4,4,7,1,5,6};
		System.out.println("have Addition 8:");
		sort(arr);
	}

}
