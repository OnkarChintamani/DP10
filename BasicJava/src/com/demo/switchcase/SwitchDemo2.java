package com.demo.switchcase;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		System.out.println("-----welcome to starbucks-----");
		System.out.println("A.Tea\nB.Coffeen\nC.Sandwitch");
		System.out.println("Enter The Number :");
		choice=sc.next().charAt(0);
		switch (choice) {
		case 'a': 
		case 'A':
			System.out.println("Tea is for 30 rs.");
		break;
		case 'b':
		case 'B':
			System.out.println("Coffee is for 50 rs.");
		break;
		case 'c':
		case 'C':
			System.out.println("Sandwitch is for 60 rs.");
		break;
		default:
			System.out.println("invalid no.");
		}

	}

}
