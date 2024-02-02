package com.oops.classobject;

public class PrintTest {
	public  void printMsg(String name) {
		System.out.println("Good Morning "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object
		//non-refrance
		new PrintTest().printMsg("onkar");
		
		//with ref.
		PrintTest c1=new PrintTest();
		c1.printMsg("aaditya");
		c1.printMsg("om");
	}

}
