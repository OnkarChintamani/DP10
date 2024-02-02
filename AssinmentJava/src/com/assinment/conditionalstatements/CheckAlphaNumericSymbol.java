
/*Write a Java program to input any character and 
 check whether it is alphabet, digit or special character */

package com.assinment.conditionalstatements;

import java.util.Scanner;

public class CheckAlphaNumericSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter The Charcter");
		ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

			System.out.println(": This is Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(": This is Number");
		} else {
			System.out.println(": This is  Symbol");
		}

	}

}
