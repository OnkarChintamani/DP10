package com.oops.classobject;

import java.util.Scanner;

class Calculator{
	public int addNum(int a,int b) {
		return a+b;
	}
	public int subNum(int a,int b) {
		return a-b;
	}
	public int multiNum(int a,int b) {
		return a*b;
	}
	public int divNum(int a,int b) {
		return a/b;
	}
}

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Eneter the 1st No : ");
		a=sc.nextInt();
		System.out.println("Enter the 2nd No : ");
		b=sc.nextInt();
		
		Calculator c1=new Calculator();
		int add=c1.addNum(a, b);
		int sub=c1.subNum(a, b);
		int multi=c1.multiNum(a, b);
		int div=c1.divNum(a, b);
		System.out.println("----------Calculator----------");
		System.out.println("Addition Of No is       :"+add);
		System.out.println("Subtraction Of No is    :"+sub);
		System.out.println("Multiplication Of No is :"+multi);
		System.out.println("Division Of No is       :"+div);


	}

}
