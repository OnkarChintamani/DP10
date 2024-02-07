package com.basic;

public class FindMaxInArray {

	static int findMax(int arr[]) {
		int max=arr[0];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
	
	static int findMin(int arr[]) {
		int min=arr[0];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
			min=arr[i];
		}
		return min;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,4,7,8,9,5};
		System.out.println("Max: "+findMax(arr));
		System.out.println("Min: "+findMin(arr));

	}

}
