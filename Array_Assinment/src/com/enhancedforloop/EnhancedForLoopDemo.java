package com.enhancedforloop;

import java.util.Arrays;
import java.util.Scanner;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		// cannot use:
		//reffer index,
		//updation.
		int ar[]= {4,5,6,7,8,9};
		for(int x:ar) {
			System.out.println(x);
		}
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("Enter the No.");
		for(int x:arr) {  // not adding element
			x=sc.nextInt();
			System.out.println(x);
		}
		System.out.println(Arrays.toString(arr));
	}

}
