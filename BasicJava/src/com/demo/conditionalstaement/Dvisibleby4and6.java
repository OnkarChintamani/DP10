package com.demo.conditionalstaement;

import java.util.Scanner;

public class Dvisibleby4and6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.");
			num=sc.nextInt();
			if (num%4==0) {
				if (num%6==0) {
					System.out.println(num +" : is divisible by 4 and 6" );
				}
				else {
					System.out.println(num+" : is only divisible by 4");
				}
				
			}
			else if(num%6==0) {
				System.out.println(num+" : is only divisble by 6");
			}
			else {
				System.out.println(num+" : is not devisible by 4 and 6");
			}
	}

}
