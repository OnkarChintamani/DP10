package com.oops.constructor;

public class Bank {
	public Bank() {
		this("");

		System.out.println("Default Constructor");
	}
	public Bank(int num) {
		this();
		System.out.println("Parameter Constructor");
	}
	public Bank(String str) {
//		this();
		System.out.println("String Constructor");
	}

}
