package com.assinment.conditionalstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year; 
		String result;
		System.out.println("Enter The Year : ");
		year = sc.nextInt();
		
		// using if else
		
		/*if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(": This Is Leap Year");
		} else {
			System.out.println(": This Is Not Leap Year");
		}*/
		
		//using else if ladder
		
		/*if (year%4==0 && year%100!=0) {
			System.out.println("This is Leap Year");
		}
		else if (year%400==0) {
			System.out.println("This is Leap Year");
		}
		else
			System.out.println("This is not Leap Year");*/
		
		//using Ternory Oprator
		
		result=(year%4==0&&year%100!=0)|| year%400==0?"This Is Leap Year":"This Is Not Leap Year";
		System.out.println(result);
	}

}
