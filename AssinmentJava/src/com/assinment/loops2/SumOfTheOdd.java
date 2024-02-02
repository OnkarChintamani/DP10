package com.assinment.loops2;

import java.util.Scanner;

public class SumOfTheOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		n=sc.nextInt();
		for(i=0;i<=n;i++) {
			if(i%2!=0)
				sum+=i;
		}
		System.out.println(sum+": is sum of odd no");
	}

}
