package com.assinment.loops;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseRange {

	public static int reversNo(int num) {
		int rem;int rev=0;int org=num;
		while (num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void printRange(int num1,int num2) {
		int check;
		if (num1<num2) {
			for (int i = num1; i <=num2; i++) {
				check=reversNo(i);
				System.out.println(i+" : "+check);
			}
		}
		else
			System.out.println("please insert 1st No smaller Than 2nd No.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("-----Enter the range-----");
		System.out.println("Enter 1st No :");
		num1=sc.nextInt();
		System.out.println("Enter 2nd No :");
		num2=sc.nextInt();
		printRange(num1, num2);
		
		
	}

}
