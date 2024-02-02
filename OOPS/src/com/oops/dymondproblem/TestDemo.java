package com.oops.dymondproblem;

interface Vechical{
	default void wheels() {
		System.out.println("have wheels");
	}
}
interface Car extends Vechical{
	default void wheels() {
		System.out.println("have 4 wheels");
	}
}
interface Bike extends Vechical{ 
	default void wheels() {
		System.out.println("have 2 wheels");
	}
}
class Honda implements Car,Bike{
	public void wheels() {
		Car.super.wheels();
		Bike.super.wheels();
		//not access of parent interface (Vechical)of Car,Bike
	}
}
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h1=new Honda();
		h1.wheels();
	}

}
