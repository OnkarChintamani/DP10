package com.varags;

public class VaragsWrapper {
	static void displayMe(Object ...o1) {
		System.out.println("In Object");
		for(Object o:o1) {
			System.out.println(o);
		}
	}
	static void displayMe(Number ...i1) {
		System.out.println("In Number");
		for(Number i:i1) {
			System.out.println(i);
		}
	}
	static void displayMe(Character ...c1) {
		System.out.println("In Character");
		for(Character c:c1) {
			System.out.println(c);
		}
	}
	static void displayMe(Double ...d1) {
		System.out.println("In Double");
		for(Double d:d1) {
			System.out.println(d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMe(1,3,4,5,'a');
		displayMe(1,2,3,4,5.1);
	}

}
