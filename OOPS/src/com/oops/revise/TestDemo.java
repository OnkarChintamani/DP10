package com.oops.revise;

public class TestDemo {
	static int a;
	final int b; //initizling is mandatory
	int c;
	{
		b=10;
	}
	public static void show() {
		a=10;
//		c=20;  // we can not access instence variable in static method.
	}
	public void shows() {
		a=100;
		c=200;   // we can access both static and instence variable in instace method.
	}
	public static void main(String[] args) {
		TestDemo t1=new TestDemo();
		System.out.println(TestDemo.a); //we can access Static variable by class name
//		TestDemo.c// we can not access instence variable by class name
		
		t1.c=10;
		
		System.out.println();
	}
}
