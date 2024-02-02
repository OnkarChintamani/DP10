package com.demo.methods;

import java.util.Scanner;

public class DoWhileTest {
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,sum;
		char ch;
		do {
		System.out.println("Enter 1st No. :");
		n1=sc.nextInt();
		System.out.println("Enter 2nd No. :");
		n2=sc.nextInt();
		sum=add(n1, n2);
		System.out.println(sum);
		System.out.println("do you want to continue?? if yes then enter 'y' and for stop enter any char");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("end!!!");
	}

}
