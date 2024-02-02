package com.oops.inheritance;

public class Check extends CheckAccess {

	public static void main(String[] args) {
		CheckAccess ca=new CheckAccess();
//		ca.b;
//		ca.c;
//		ca.d;
		Check ch=new Check();
		//ch.b;
		ch.c=10;
		ch.d=10;
		ch.b=10;
		ch.a=10;
		
		
	}
}
