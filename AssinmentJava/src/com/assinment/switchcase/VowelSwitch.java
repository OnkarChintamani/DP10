package com.assinment.switchcase;

import java.util.Scanner;

public class VowelSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("*Check Alpabets Wheter It's Vowel Or Consonent*");
		System.out.println("Eneter Alpabet :");
		ch=sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println(": is Vowel");
			break;
		case 'e':
			System.out.println(": is Vowel");
			break;
		case 'o':
			System.out.println(": is Vowel");
			break;
		case 'u':
			System.out.println(": is Vowel");
			break;
		case 'i':
			System.out.println(": is Vowel");
			break;
		default:
			System.out.println(": is Not Vowel");
			break;
		}
	}


}
