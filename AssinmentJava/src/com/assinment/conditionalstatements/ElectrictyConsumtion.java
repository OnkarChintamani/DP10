
/*Write a Java program to input electricity consumption unit and 
 calculate totale lectricity bill according to the given 
condition: For first 50 units Rs. 0.50/unit For next 100 units 
Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill*/

package com.assinment.conditionalstatements;

import java.util.Scanner;

public class ElectrictyConsumtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double units, surcharge, total;
		System.out.println("Enter Your Units");
		units = sc.nextDouble();
		if (units > 0) {
			if (units <= 50) {
				units = units * 0.50;
				surcharge = units / 20;
				total = units + surcharge;
				System.out.println(units + " : IS YOUR BILL " + "\n" + surcharge + " : IS YOUR SURCHARGE" + total
						+ " : IS YOUR TOTAL");
			} else if (units > 50 && units <= 150) {
				units = units * 0.75;
				surcharge = units / 20;
				total = units + surcharge;
				System.out.println(units + " : IS YOUR BILL " + "\n" + surcharge + " : IS YOUR SURCHARGE" + total
						+ " : IS YOUR TOTAL");
			} else if (units > 150 && units <= 250) {
				units = units * 1.20;
				surcharge = units / 20;
				total = units + surcharge;
				System.out.println(units + " : IS YOUR BILL " + "\n" + surcharge + " : IS YOUR SURCHARGE" + total
						+ " : IS YOUR TOTAL");
			} else if (units > 250) {
				units = units * 1.50;
				surcharge = units / 20;
				total = units + surcharge;
				System.out.println(units + " : IS YOUR BILL " + surcharge + "\n: IS YOUR SURCHARGE " + total
						+ "\n: IS YOUR TOTAL");
			}
		} else {
			System.out.println("Enter Valid Units");
		}
	}

}
