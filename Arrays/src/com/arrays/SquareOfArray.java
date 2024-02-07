package com.arrays;

import java.util.Arrays;

//sum of even no

public class SquareOfArray {
	
	static void squareofElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("inside method");
		System.out.println(Arrays.toString(arr));
	}
	
	int sumOfElements(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	int sumOfElementsEven(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareOfArray s1=new SquareOfArray();
		int arr[]= {5,6,0,3,2,2};
		System.out.println(arr);//hascode, Object inherite
		System.out.println(Arrays.toString(arr));
		System.out.println("Square of Elements:");
		squareofElements(arr);
		System.out.println("Sum of Elements:");
	//	s1.sumOfElements();
		System.out.println("sum is :"+s1.sumOfElements(new int[] {1,3,6,7,9,0}));
		System.out.println("Sum of Even :");
		System.out.println("sum:"+s1.sumOfElementsEven(arr));
	}

}
