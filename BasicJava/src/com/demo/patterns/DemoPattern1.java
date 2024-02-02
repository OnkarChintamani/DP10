package com.demo.patterns;

import java.util.Scanner;

public class DemoPattern1 {
	public static void pattern(int num) {
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter The No Of Rows :");
		n=sc.nextInt();
		pattern(n);
	}

}
