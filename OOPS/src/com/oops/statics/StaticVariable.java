package com.oops.statics;

public class StaticVariable {

	int x=10; //instance variable
	static int y=20; //static variable
	
	void instanceMethod() {
		System.out.println(x);
		System.out.println(y);
	}
	//in static method  can access only static
	//access intance -we 
	static void staticMethod() {
		StaticVariable s1=new StaticVariable();

		System.out.println(s1.x);
		System.out.println(y);
	}
	public void show() {
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s1=new StaticVariable();
		System.out.println(s1.x);
		System.out.println(StaticVariable.y);

	}

}
