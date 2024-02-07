package com.arrays;

public class MinChar {
	static void findmin(char[] arr) {
		char min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum :"+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','d','e','f'};
		findmin(arr);
	}

}
