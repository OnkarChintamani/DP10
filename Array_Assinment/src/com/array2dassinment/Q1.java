package com.array2dassinment;

import java.util.Scanner;

//1.	wAP to accept data in 2D array of 3X4 and accept data.
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter values in rows:" + (i+1));
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
