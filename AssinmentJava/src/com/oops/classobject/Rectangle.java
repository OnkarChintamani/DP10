package com.oops.classobject;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double value1;
		double value2;
		
		System.out.println("Eneter the length of Rectangle :");
		value1=sc.nextDouble();
		System.out.println("Eneter the Width of Rectangle :");
		value2=sc.nextDouble();

		RectangleTest r1=new RectangleTest();
		r1.setValue(value1, value2);
		r1.areaRect();
		r1.perimeterRec();
		r1.showValue();
	}

}
