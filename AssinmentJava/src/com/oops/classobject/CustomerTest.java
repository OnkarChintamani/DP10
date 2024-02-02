package com.oops.classobject;
 class Customer{
	int id;
	String name;
	public void showDetail() {
		System.out.println("Custmoer ID : "+id);
		System.out.println("Custmoer Name : "+name);
		
	}
	public void shop() {
		System.out.println(id);
	}
}

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.showDetail();
		c1.shop();
	}

}
