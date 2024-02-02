package com.demo.methods;

public class DoWhileLoop {
	public static void printNo() {
		int n=1;
		do {
			System.out.println(n);
			n++;
		} while (n<=10);
	}
	public static void printNum(int n) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		} while (i<=n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNo();
		System.out.println("-----------------");
		printNum(50);
	}

}
