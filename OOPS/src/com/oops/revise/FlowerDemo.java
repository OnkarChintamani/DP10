package com.oops.revise;
class Flower{
	void m1() {
		
	}
	static void m2() {
		
	}
	void m4() {
		
	}
}
class Rose extends Flower{
	public void m1() {
		
	}
	void m3() {
		
	}
}

public class FlowerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f = new Rose();
		f.m1();
	//	f.m3();
	}

}
