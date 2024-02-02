package com.assinment.switchcase;

import java.util.Scanner;

public class PrintWordSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter The Number :");
		num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println(": One");
			break;
		case 2:
			System.out.println(": Two");
			break;
		default:
			System.out.println(": Only 1-5 No. Are Valid");
			break;
		case 3:
			System.out.println(": Three");
			break;
		case 4:
			System.out.println(": Four");
			break;
		case 5:
			System.out.println(": Five");
			break;
		
		}
	}

}
