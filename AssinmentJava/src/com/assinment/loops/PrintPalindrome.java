package com.assinment.loops;

import java.util.Scanner;

public class PrintPalindrome {
	public static boolean findPlaindrome(int num) {
		int org=num; int rev=0,rem;
		while (num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		if (org==rev) 
			return true;
		return false;
		
	}
	public static void printPalindrome(int num) {
		for (int i =1 ; i <=num; i++) {
			boolean check=findPlaindrome(i);
			if(check)
				System.out.println(i+" : is Palindrome No.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. :");
		num=sc.nextInt();
		printPalindrome(num);

	}

}
