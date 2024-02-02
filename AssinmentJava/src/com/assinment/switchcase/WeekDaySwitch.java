package com.assinment.switchcase;

import java.util.Scanner;

public class WeekDaySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day;
		System.out.println("Enter The Day No.");
		day=sc.nextInt();
		switch (day) {
		case 1:
			System.out.println(": This is Monday");
			break;
		case 2:
			System.out.println(": This is Tuesday");
			break;
		case 3:
			System.out.println(": This is Wednesday");
			break;
		case 4:
			System.out.println(": This is Thursday");
			break;
		case 5:
			System.out.println(": This is Friday");
			break;
		case 6:
			System.out.println(": This is Saturday");
			break;
		case 7:
			System.out.println(": This is Sunday");
			break;
		default:
			System.out.println(": Enter 1-7 No. Bcz In Week There Are Only 7 Days ");
			break;
		}
	}

}
