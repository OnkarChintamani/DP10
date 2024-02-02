
/*Write a Java program to input basic salary of an employee and calculate its 
Gross salary according to following: Basic Salary <= 10000 
: HRA = 20%,DA = 80% Basic Salary <= 20000 : HRA = 25%, 
DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%*/

package com.assinment.conditionalstatements;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double salary, hra, da;
		System.out.println("Eneter Your Salary");
		salary = sc.nextDouble();
		if (salary <= 10000) {
			hra = salary / 20;
			da = salary / 80;
			System.out.println("Your Salary Is :" + salary + "\nYour HRA Is    :" + hra + "\nYour DA Is     :" + da);
		} else if (salary <= 20000) {
			hra = salary / 25;
			da = salary / 90;
			System.out.println("Your Salary Is :" + salary + "\nYour HRA Is    :" + hra + "\nYour DA Is     :" + da);
		} else if (salary > 20000) {
			hra = salary / 30;
			da = salary / 95;
			System.out.println("Your Salary Is :" + salary + "\nYour HRA Is    :" + hra + "\nYour DA Is     :" + da);
		} else {
			System.out.println("Eneter Valid Salary!!!");
		}

	}

}
