package com.oops;
class Bank{
	void display()
	{
		System.out.println("rate of interst is 7%");
	}
}
class SBI extends Bank {
	double rate=8.9;
	void show (){
		System.out.println("show");
	}
	void display()
	{
		System.out.println("SBI rate of interset is "+rate+"%");
	}
}
class HDFC extends Bank {
	double rate=9.5;

	void display() {
		System.out.println("HDFC rate of interst is "+rate+"%");
	}
}
public class DynamicDispatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		b.display();
	//	b.show();
		b=new HDFC();
		b.display();
	}

}
