package com.demo.switchcase;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("---Welcome To Amazon---");
		System.out.println("1.Men\n2.Women\n3.Kids");
		System.out.println("Enter No.");
		choice=sc.nextInt();
		switch (choice) {
		case 1: 
			System.out.println("Welcome To Men's Section :");
			System.out.println("1.Footware\n2.Tshirt\n3.Wallet");
			System.out.println("Enter the No. :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You Choose Footware");
				break;
			case 2:
				System.out.println("You Choose Tshirt");
				break;
			case 3:
				System.out.println("You Choose Wallet");
				break;

			default:
				System.out.println("Enter Valid No.");
				break;
			}
			break;
		case 2:
			System.out.println("Welcome To Women's Section :");
			System.out.println("1.Jwellery\n2.Saree");
			System.out.println("Enter the No. :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You Choose Jwellery");
				break;
			case 2:
				System.out.println("You Choose Saree");
				break;

			default:
				System.out.println("Enter Valid No.");
				break;
			}
			break;
		case 3:
			System.out.println("Welcome To Kid's Section :");
			System.out.println("1.Toy's\n2.Book's");
			System.out.println("Enter the No. :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You Choose Toys");
				break;
			case 2:
				System.out.println("You Choose Books");
				break;

			default:
				System.out.println("Enter Valid No.");
				break;
			}
			break;
		default:
			System.out.println("enter valid no.");
		}
	}

}
