package com.basic;

public class AvrageArrayMehod {
	static void findAvrage(int[] arr) {
		int sum = 0;
		int avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		avg = sum / arr.length;
		System.out.println("Avrage No Of An Arrays Is: " + avg);
	}

	static int findAvrage1(int[] arr) {
		int sum = 0;
		int avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		avg = sum / arr.length;
		return avg;
	}
	static double findAvrage2(int[] arr) {
		int sum = 0;
		int avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		avg = sum / arr.length;
		return avg;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		findAvrage(arr);
		System.out.println("Usin Int return type:"+findAvrage1(arr));
		System.out.println("Usin Double return type:"+findAvrage2(arr));


	}

}
