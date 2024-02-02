package com.assinment.loops2;

import java.util.Scanner;

public class BasePower {
	public static int findBase(int n,int p) {
		int ans=1;
		for (int i = 1; i <= p; i++) {
			ans=ans*n;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,pow;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base :");
		base=sc.nextInt();
		System.out.println("Enter the pow :");
		pow=sc.nextInt();
		int check=findBase(base, pow);
		System.out.println("Ans : "+check);
	}

}
