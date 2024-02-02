package com.oops.polymorphism;

public class Typeprmotion {
//	static void display(char n) {
//		System.out.println("char"+n);
//	}
	static void display(int n,double d) {
		System.out.println("long double");
	}
	static void display(long l,float f) {
		System.out.println("float int");
	}
	static void display(int n) {
		System.out.println("int "+n);
	}
//	static void display(long l) {
//		System.out.println("long: "+l);
//	}
	static void display(float f) {
		System.out.println("float: "+f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	display(7l,1.8);
		display('a'); //ASCII value
		display(3l);
	}

}
