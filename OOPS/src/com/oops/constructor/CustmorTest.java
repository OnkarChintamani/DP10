package com.oops.constructor;

public class CustmorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Customer c2=new Customer("om", "om@.mail", "9827327182");
		Customer c3=new Customer(1, "onkar", "onkar@.mail", "7654392221");
		c1.show();
		System.out.println();
		c2.show();
		System.out.println();
		c3.show();
	}

}
