package com.oops.abstracts;

abstract class Bike{
	//instance variables
	private int id;
	private String name;
	private double cost;
	
	//satic variable
	static String brandname;
	static double discount;
	
	static {
		brandname="Honda";
	}
	//constructor : to initilize instance varible
//	Bike{
//		
//	}
	Bike(){
		
	}
	Bike(int id,String name,double cost){
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
class BasicBike extends Bike{
	private float avg;
	public BasicBike() {
		super();
	}
	
}
class SportBike extends Bike{
	private int gears;
	private float speed;

	public SportBike() {
		
	}
	public SportBike(int id,String name, double cost,int gears,float speed) {
		super(id, name, cost);
		this.gears=gears;
		this.speed=speed;
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bike b;
//		Bike.setDiscount(20);
//		b=new SportBike(1, 2);
//		b.display();
//		System.out.println("------------------------");
//		b.discription();
//		
		System.out.println("===============================");
	//	b.
	}

}
