package com.demo.conditionalstaement;

import java.util.Scanner;

public class prizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		a=sc.nextInt();
		if (a<=1 && a<=3) {
			System.out.println("Congratulations!!! You Won Laptop");
			
		}
		else if(a>=4 && a<=6) {
			System.out.println("Congratulations!!! You Won iphone");

		}
		else if(a>=7 && a<=10) {
			System.out.println("Congratulations!!! You Won Mobile");

		}

		else {
			System.out.println("sorry!!! Better Luck Next Time");
		}

	}

}
