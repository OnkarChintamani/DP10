package com.demo.methods;

import java.util.Scanner;

public class SumCheck {
	public static int sumCheckM(int a,int b,int c) {
		int sum= a+b+c;
		System.out.println("sum : "+sum);
		
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("enter num1 :");
		num1=sc.nextInt();
		System.out.println("enter num2 :");
		num2=sc.nextInt();
		System.out.println("enter num3 :");
		num3=sc.nextInt();
		int sumCheck = sumCheckM(num1,num2,num3);
		if (sumCheck>100) {
			System.out.println("---hello---");
		}
		else
			System.out.println("---hi---");
	}

}
