package com.oops.interfaces;

interface Movable {
	void move();
}

interface Printable extends Movable {
	void print();
}

class Printer implements Printable{
	public void print() {
		System.out.println("Images are Printng....");
	}
	public void move() {
		System.out.println("Printer is Movable.......");
	}
}
class Car implements Movable{
	public void move() {
		System.out.println("Car is Movable at Max speed 200km/h");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m;
		m=new Car();
		m.move();
		m=new Printer();
		m.move();
		//m.print();
		System.out.println("===============================");
		Printable p;
		p=new Printer();
		p.move();
		p.print();
	}

}
