 package com.assinment.loops2;

import java.util.Scanner;

public class CountNumber {
	public static int countDigit(int num) {
		int rem,count=0;
		while (num!=0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,count;
		System.out.println("Enter the no :");
		n=sc.nextInt();
		count=countDigit(n);
		System.out.println(count+" : digit is there ");
	}

}
