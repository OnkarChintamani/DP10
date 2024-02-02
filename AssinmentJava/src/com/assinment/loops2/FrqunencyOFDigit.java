package com.assinment.loops2;

import java.util.Scanner;

public class FrqunencyOFDigit {
	public static int countDigit(int n, int i) {
		int rem,count=1;
		while(n!=0) {
			rem=n%10;
			if(rem==i)
				count++;
			n/=10;
		}
		return count;
	}
	public static void frqunencyDigit(int num) {
		int org=num;
		int count=0,i;
		for ( i = 0; i < 9; i++) {
			num=countDigit(num, i);
			System.out.println(num+": "+i);

		}
		System.out.println(num+": "+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		num=sc.nextInt();
		frqunencyDigit(num);
		
	}

}
