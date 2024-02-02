package com.oops.classobject;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTest f1=new FoodTest();
		FoodTest f2=new FoodTest();
		FoodTest f3=new FoodTest();
		
		f1.setFood(1, "pav bhaji", 100);
		f2.setFood(2, "vada pav", 20);
		f3.setFood(3, "cake", 150);
		
		f1.showfood();
		f2.showfood();
		f3.showfood();
	}

}
