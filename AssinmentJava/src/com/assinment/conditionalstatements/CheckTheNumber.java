
/*Write a Java program to check whether a 
number is negative, positive or zero */


package com.assinment.conditionalstatements;

import java.util.Scanner;

public class CheckTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num ;
		System.out.println("Eneter the No.");
		num=sc.nextInt();
		if (num>=1) {
			System.out.println(": This No. is Positive");
		} 
		else if (num<=-1) {
			System.out.println(": This No. is Negetive");
		} else{
			System.out.println(": This is Zero");
		}

	}

}
