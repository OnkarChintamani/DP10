package com.varags;
class Parent{
	void display(int ...a) {
		System.out.println("in parent");
	}
}
class Child extends Parent{
	@Override
	void display(int ...a) {
		System.out.println("in child");
	}
}
public class VaragsOveriding {
	public static void main(String[] args) {
		Child c1=new Child();
		c1.display(4,5,6,7,8);
	}
}
