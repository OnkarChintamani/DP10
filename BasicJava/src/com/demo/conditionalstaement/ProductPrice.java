package com.demo.conditionalstaement;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=50;
		int price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the quantity");
		price=sc.nextInt();
		if (price<=10) {
			price=price*50;
			System.out.println(price+": This is Total");
			System.out.println("With No Discount");
		}
		else if (price<10 && price>=25) {
			price=price*50;
			int dis=(2*price)/100;
			System.out.println(dis+": This is Total");
			System.out.println(": With 2% Discount");

		}
		else if (price<25 && price>=50) {
			price=price*50;
			int dis=(10*price)/100;
			System.out.println(dis+": This is Total");
			System.out.println(": With 10% Discount");

		}
		else if (price<50 ) {
			price=price*50;
			int dis=(20*price)/100;
			System.out.println(dis+": This is Total");
			System.out.println(": With 20% Discount");

		}
		

	}

}
