package com.demo.loops;

import java.util.Scanner;

public class DigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num :");
		num=sc.nextInt();
		while (num!=0) {
			rem=num%10;
			System.out.println(sum);
			num=num/10;
			System.out.println("rem : "+rem+": next num : "+num);
		}
	}

}
