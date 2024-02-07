package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindsqrOrcube {
	static void squareofElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("inside method");
		System.out.println(Arrays.toString(arr));
	}
	static void findCube(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int [] arr= {1,2,5,9,5,7,8};
		System.out.println("What do yo want?"+"\npress 2 if you want to Squre & For Cube press 3");
		num=sc.nextInt();
		
		switch (num) {
		case 2:
			System.out.println("Square of all elements of arrays are:");
			squareofElements(arr);
			break;
		case 3:	System.out.println("Cube of all elements of arrays are:");
		     findCube(arr);
			break;
		default:
			System.out.println("enter valid choice");
			break;
		}
		
	}

}
