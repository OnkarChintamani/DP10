package com.oops.revise;

interface Water {

	default void reverwater() {
		System.out.println("Rever fish ");
	}
}

class Fish {
	String name;
	int gills;

	Fish() {

	}

	Fish swim() {
		System.out.println("Fish can Swim");
		return this;
	}
}

class GoldFish extends Fish implements Water {
	GoldFish() {

	}

	public GoldFish swim() {
		System.out.println("Gold Fish can Swim");
		return this;
	}

	public void reverwater() {
		System.out.println("it find in at Rever ");
		Water.super.reverwater();
	}
}

class Whale extends Fish {
	Whale() {

	}

	protected Whale swim() {
		System.out.println("Whale Fish can Swim");
		return this;
	}
}

public class FishDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f;
		Water w = new GoldFish();
		f = new GoldFish(); // changing access modifier and return type
		f.swim();
		w.reverwater();

	}

}
