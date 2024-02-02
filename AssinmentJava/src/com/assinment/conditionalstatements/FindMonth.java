
// Write a Java program print total number of days in a month 

package com.assinment.conditionalstatements;

import java.util.Scanner;

public class FindMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int months;
		System.out.println("Enter Month No. : ");
		months = sc.nextInt();
		if (months >= 1 && months <= 12) {
			if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12)

				System.out.println(": In This Months Total days are 31");

			else if (months == 4 || months == 6 || months == 9 || months == 11)

				System.out.println(": In This Months Total day are 30");

			else if (months == 2)

				System.out.println(": In This Months Total days are 28");
		} else

			System.out.println("Enter Valid No.");

	}

}
