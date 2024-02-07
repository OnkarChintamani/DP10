package com.basic;

public class CountNegative {
	static void printNegative(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("Count of Negative no:"+count);
	}
	public static void main(String[] args) {
		
		int [] arr= {-89,76,-95,-56,94,-18,-54};
		printNegative(arr);
	}

}
