package com.basic;

public class TraverseArray {
	static int sumOfOdd(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,4,87,13,14};
		System.out.println("Sum Of All Odd Elements Is:");
		System.out.println(sumOfOdd(arr));
	}

}
