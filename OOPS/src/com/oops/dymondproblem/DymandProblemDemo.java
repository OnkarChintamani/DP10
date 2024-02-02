package com.oops.dymondproblem;
interface One{
	default void print(){
		System.out.println("one");
	}
	abstract void show();
}
interface Two extends One{
	default void print(){

		System.out.println("two");
		One.super.print();

	}
}
interface Three extends One{
	default void print(){
		System.out.println("three");
	}
}
class Main1 implements Two,Three{

	@Override
	public void print() {
		//One.super.print();
		Three.super.print();
		Two.super.print();
		System.out.println("Main");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	}
	
}
public class DymandProblemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 m=new Main1();
		m.print();
	}

}
