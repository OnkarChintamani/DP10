package com.oops.object;

import java.util.Scanner;

public class ProductTest {
	 	static Scanner sc=new Scanner(System.in);
	 	public void display(Product p) {
	 	
	 		System.out.println("Enter pid: ");
	 		p.setPid(sc.nextInt());
	 		System.out.println("Enter pname: ");
	 		
	 		System.out.println("Enter price: ");
	 		System.out.println("Enter qantity: ");
	 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
