package com.oops.covariant;

class Car {
	public Car detailes() {
		System.out.println("Car");
		return this;
	}
}

class Bmw extends Car {
	public Bmw detailes() {
		System.out.println("BMW Car");
		return this;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Bmw b = new Bmw();

		c.detailes();

		c = new Bmw();
		c.detailes();
		b.detailes();
	}

}
