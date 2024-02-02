package com.assinment.loops;

import java.util.Scanner;

public class PrintArmstrongNo {
	public static int checkPow(int base,int pow) {
		int ans=1;
		for (int i = 1; i <=pow; i++) {
			ans=ans*base;
		}
		return ans;
	}
	public static int checkDigit(int num) {
		int count=0;
		while (num!=0) {
			count++;
			num/=10;
		}
		return count;
	}

	public static boolean checkArmstrong(int num) {
		int rem;
		int pow=checkDigit(num);
		int org=num; int sum=0;
		while (num!=0) {
			rem=num%10;
			sum=sum+checkPow(rem, pow);
			num/=10;
		}
		if(sum==org)
			return true;
	
		return false;
		
	}
	//using method
	public static void printArmstrong(int num) {
		for (int i = 1; i < num; i++) {
			boolean check=checkArmstrong(i);
			if(check)
				System.out.println(i+" : is an Armstrong no.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.println("Enter The Range :");
			num=sc.nextInt();
			printArmstrong(num);
			
			//without using method
			
		/*	for (int i = 1; i < num; i++) {
				
			
			boolean check=checkArmstrong(i);
			if(check)
				System.out.println(i+" : is an Armstrong no.");
		else
		System.out.println(i+" : is not an Armstrong no.");
			}*/
	}

}
