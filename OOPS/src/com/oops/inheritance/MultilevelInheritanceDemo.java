package com.oops.inheritance;

class Vehicle {
	private int vno;
	private String model;
	protected double price;

	public Vehicle() {
		System.out.println("default 'vehicle'");
	}

	public Vehicle(int vno, String model, double price) {
		this.vno = vno;
		this.model = model;
		this.price = price;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public int getVno() {
		return vno;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}

class Car extends Vehicle {
	private int noGears;
	private String fuleType;

	public Car() {
		System.out.println("default 'car'");
	}

	public Car(int vno, String model, double price, int noGears, String fuleType) {
		super(vno, model, price);
		this.noGears = noGears;
		this.fuleType = fuleType;
	}

	public int getNoGears() {
		return noGears;
	}

	public void setNoGears(int noGears) {
		this.noGears = noGears;
	}

	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	public String toString() {
		return "Car :" + " " + getVno() + " " + getModel() + " " + price + " " + noGears + " " + fuleType;
	}
}

class SportCar extends Car {
	private String name;
	private double milage;

	public SportCar() {

	}

	public SportCar(int vno, String model, double price, int noGears, String fuleType, String name, double milage) {
		super(vno, model, price, noGears, fuleType);
		this.milage = milage;
		this.name = name;
	}

	public String toString() {
		return "Car :" + "Car_no:" + getVno() + " Car_model:" + getModel() + " price:" + price + " gears:" + getNoGears() + " fule_type:" + getFuleType()+" Name:"+name+" milage:"+milage;
	}

}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar s1 = new SportCar(1110, "TATA", 1210000, 7, "Petrol", "Jaguar", 7.8);
		System.out.println(s1);
	}

}
