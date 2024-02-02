package com.demo.methods;

import java.util.Scanner;

public class SwappingNoMethod {
	public static void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a :"+a);
		System.out.println("b :"+b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1  :");
		num1=sc.nextInt();
		System.out.println("Enter Num2  :");
		num2=sc.nextInt();
		System.out.println("---After Swapping---");
		swap(num1,num2);
	}

}
