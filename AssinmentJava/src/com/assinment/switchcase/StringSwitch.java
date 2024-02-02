package com.assinment.switchcase;

import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String state;
		System.out.println("---------Find Capital Cities of State----------");
		System.out.println("-Maharastra\n-Goa\n-UP\n-Assam");
		System.out.println("Enter The Name Of State :");
		state=sc.nextLine();
		switch (state) {
		case "Maharastra":
			System.out.println(": Capital City is Mumbai");
			break;
		case "Goa":
			System.out.println(": Capital City is Panaji");
			break;
		case "UP":
			System.out.println(": Capital City is Luknow");
			break;
		case "Assam":
			System.out.println(": Capital City is Dispur");
			break;
		default:
			System.out.println(": Only Above State");
			break;
		}
	}

}
