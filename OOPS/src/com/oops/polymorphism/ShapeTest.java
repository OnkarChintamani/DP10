package com.oops.polymorphism;
//method overlodind...
 class Shape {

	void area(int side) {
		System.out.println("Square of area is: "+side*side);
	}
	int area(int length,int breadth) {
		System.out.println("Area of rectangle is: ");
		return length+breadth;
	}
	void area(float radius) {
		System.out.println("Araea of circle is: "+3.14*radius*radius);
	}
	
}
public class ShapeTest{
	public static void main(int data) {
		System.out.println("Data: "+data);
		System.out.println("overloded main");
	}
		public static void main(String[] args) {
			Shape s1=new Shape();
			s1.area(5);
			s1.area(12, 10);
			s1.area(3.9f);
			s1.area(33);
			main(10);
			ShapeTest.main(12);
		}
}