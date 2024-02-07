package com.basic;

import java.util.Scanner;

public class Avrage {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array :");
		size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		findAvrage(arr);
		System.out.println("---------------------------------------");
		System.out.println("Avrage No Of An Arrays Is: " + findAvrage1(arr));
		sc.close();
	}

}
