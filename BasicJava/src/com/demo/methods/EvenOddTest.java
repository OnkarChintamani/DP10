package com.demo.methods;

public class EvenOddTest {
	public static void testEven(int num) {
		if (num%2==0) {
			System.out.println(": is even");
		} else {
			System.out.println(": is odd");
		}
	}
		public static boolean evenOdd(int num) {
			return num%2==0;
		}
		public static int evenOddTes(int num) {
			return num%2;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		testEven(n);
		boolean status=evenOdd(n);
		if (status) 
			System.out.println(": is even");
		 else 
			System.out.println(": is odd");
		int res=evenOddTes(n);
		if (res==0) {
			System.out.println(": is even");
		} else {
			System.out.println(": is odd");
		}
		
	}

}
