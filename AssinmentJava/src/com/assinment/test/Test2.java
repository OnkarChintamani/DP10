package com.assinment.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the  1st no.");
		n=sc.nextInt();
				while (ans<=100) {
					if (n>=0) 
						ans+=n;
					
					
		//	ans+=n;

//			do {
//				ans=n+n;
//				n++;
//				System.out.println(ans);
//			} while (ans<=100);
//			break;
		}
				System.out.println(ans);

	}

}
