package com.demo.loops;

import java.util.Scanner;

public class StartEndTestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start No:");
		start=sc.nextInt();
		System.out.println("Enter End No:");
		end=sc.nextInt();

		while (start<=end) {
			System.out.println(start);
			start++;
		}
	}

}
