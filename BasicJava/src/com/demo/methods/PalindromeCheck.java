package com.demo.methods;

import java.util.Scanner;

public class PalindromeCheck {
	public static void palinCheck(int num) {
		int rem,check=0;
		int temp=num;
		while (num>0) {
			rem=num%10;
			check=rem+(check*10);
			num=num/10;
			
		}
		if (temp==check) {
			System.out.println(": is Palindrome");
		}
		else {
			System.out.println(": is not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Enter Number :");
		num1=sc.nextInt();
		palinCheck(num1);
	}

}
