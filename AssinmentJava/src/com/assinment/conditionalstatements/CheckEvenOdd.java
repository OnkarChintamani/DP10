
/*Write a Java program to check whether a number is even or odd */

package com.assinment.conditionalstatements;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n1;

		System.out.println("Enter the no. : ");
		n1 = sc.nextInt();

		if (n1 % 2 == 0) {
			System.out.println(": Is Even");

		} else {
			System.out.println(": Is Odd");
		}

	}

}
