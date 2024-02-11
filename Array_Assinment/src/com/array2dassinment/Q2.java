package com.array2dassinment;

import java.util.Scanner;

//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.

public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= new int [3][];
		arr[0]= new int[2];
		arr[1]=new int[3];
		arr[2]=new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements in row "+(i+1));
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
