package com.demo.loops;

public class NastedLoops {
	public static void printPrime(int n) {
		int count,i,j;
		for (i = 2;  i<=n; i++) {
			count=0;
			for ( j=2; j<=i/2; j++) {
				if (i%j==0) {
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime(50);

	}

}
