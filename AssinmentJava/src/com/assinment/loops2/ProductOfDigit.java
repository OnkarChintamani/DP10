  package com.assinment.loops2;

import java.util.Scanner;

public class ProductOfDigit {
	public static int productDigit(int n) {
		int rem,prodcut=1;
		while (n!=0) {
			rem=n%10;
			prodcut*=rem;
			n=n/10;
		}
		return prodcut;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,ans;
		System.out.println("Enter the no :");
		num=sc.nextInt();
		ans=productDigit(num);
		System.out.println(ans);

	}

}
