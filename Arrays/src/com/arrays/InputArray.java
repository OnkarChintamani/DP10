package com.arrays;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Display the elemnts :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		System.out.println("Even No: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
	}

}
