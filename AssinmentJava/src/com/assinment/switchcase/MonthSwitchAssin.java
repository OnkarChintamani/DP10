package com.assinment.switchcase;

import java.util.Scanner;

public class MonthSwitchAssin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int month;
		System.out.println("Enter Month No. To Find The Days : ");
		month=sc.nextInt();
		switch (month) {
		case 1:
			System.out.println(": This Month have 31 Days");
			break;
		case 2:
			System.out.println("\n1.In Leap Year\n2.In Non Leap Year");
			System.out.println("Enter The No. :");
			month=sc.nextInt();
			switch (month) {
			case 1:
				System.out.println(": This Month have 29 Days");
				break;
			case 2:
				System.out.println(": This Month have 28 Days");
			default:
				break;
			}
			break;

		case 3:
			System.out.println(": This Month have 31 Days");
			break;

		case 4:
			System.out.println(": This Month have 30 Days");
			break;

		case 5:
			System.out.println(": This Month have 31 Days");
			break;

		case 6:
			System.out.println(": This Month have 30 Days");
			break;

		case 7:
			System.out.println(": This Month have 31 Days");
			break;

		case 8:
			System.out.println(": This Month have 31 Days");
			break;

		case 9:
			System.out.println(": This Month have 30 Days");
			break;
		case 10:
			System.out.println(": This Month have 31 Days");
			break;

		case 11:
			System.out.println(": This Month have 30 Days");
			break;

		case 12:
			System.out.println(": This Month have 31 Days");
			break;


		
		default:
			System.out.println("Enter Valid No.");
			break;
		}
		
	}

}
