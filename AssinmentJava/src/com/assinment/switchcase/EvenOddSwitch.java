package com.assinment.switchcase;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter The No. ");
		num=sc.nextInt();
		switch (num%2) {
		case 0:
			System.out.println(": This Is Even No.");
			break;
		case 1:
			System.out.println(": This Is Odd No.");
			break;
		default:
			System.out.println("It's Natural No.");
			break;
		}

	}

}
