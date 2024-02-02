package com.assinment.conditionalstatements;

import java.util.Scanner;

public class Maximum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int b; 
		int c;
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		System.out.println("Enter C : ");
		c=sc.nextInt();
		if (a>b && a>c) {
			System.out.println(a+": A is Max");
		}
		else if (b>a && b>c) {
			System.out.println(b+": B is Max");
		}
		else {
			System.out.println(c+": C is Max");
		}
	}

}
