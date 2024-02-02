package com.demo.switchcase;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("-----welcome to starbucks-----");
		System.out.println("1.Tea\n2.Coffeen\n3.Sandwitch");
		System.out.println("Enter The Number :");
		choice=sc.nextInt();
		switch (choice) {
		case 1: 
			System.out.println("Tea is for 30 rs.");
		break;
		case 2:
			System.out.println("Coffee is for 50 rs.");
		break;
		case 3:
			System.out.println("Sandwitch is for 60 rs.");
		break;
		default:
			System.out.println("invalid no.");
		}
	}
}
