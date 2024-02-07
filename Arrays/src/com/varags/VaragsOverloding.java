package com.varags;

public class VaragsOverloding {
	static void display(int ...a1) {
		System.out.println("In int");
		for(int x:a1) {
			System.out.println(x);
		}
	}
	static void display(double ...d1) {
		System.out.println("In double");
		for(double x:d1) {
			System.out.println(x);
		}
	}
	static void display(int x,char ...ch) {
		System.out.println(x);
		for (char c : ch) {
			System.out.println(c);
		}
	}
	static void display(char c,int ...a1) {
		System.out.println(c);
		for (int a : a1) {
			System.out.println(a);
		}
	}
	static void show(Integer ...i1) {
		System.out.println("In Wrapper int");
	}
	static void show(Character ...i1) {
		System.out.println("In Wrapper Character");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(10.5,55.0,22.3);
		display(5,8,9,3);
		display('a','b',1,'c');
		
		show(1,2,3,4);
	}

}
