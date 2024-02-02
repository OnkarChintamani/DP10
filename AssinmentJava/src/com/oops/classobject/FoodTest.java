package com.oops.classobject;

public class FoodTest {
	int foodid;
	String foodname;
	double foodprice;
	
//	public void setFood(int fid,String fname,double fprice) {
//		foodid=fid;
//		foodname=fname;
//		foodprice=fprice;
//	}
	public void setFood(int foodid,String foodname,double foodprice) {
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
	}

	public void showfood() {
		System.out.println("food id    :"+foodid);
		System.out.println("food name  :"+foodname);
		System.out.println("food price :"+foodprice);
		System.out.println("------------------------");
	}
}
