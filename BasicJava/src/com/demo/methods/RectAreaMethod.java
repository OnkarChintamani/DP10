package com.demo.methods;

import java.util.Scanner;

public class RectAreaMethod {

	public static void rectArea(double l,double b){
		double area=l*b;
		System.out.println(area+": is Area");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectArea(5,6);
		//case 2
		Scanner sc=new Scanner(System.in);
		double len,bre;
		System.out.println("Enter the len :");
		len=sc.nextDouble();
		System.out.println("Enter the bre :");
		bre=sc.nextDouble();
		rectArea(len,bre);
	}

}
