package com.oops.classobject;

public class BankTest {
	int count=0;
	public void countNo() {
		count++;
		System.out.println("count :"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTest b1=new BankTest();
		BankTest b2=new BankTest();
		BankTest b3=new BankTest();
		b1.countNo();
		//b1.countNo();
		b2.countNo();
		b3.countNo();
	}

}
