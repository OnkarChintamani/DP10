package com.demo.methods;

public class PrintPrimeNo {
	public static boolean primeCheck(int num) {
		int count=0;
		for (int i = 2; i <=num/2; i++) {
		
				if (num%i==0) {
					count++;
					break;
				}
			}
			if (count==0) 
				
				return true;

			else 
				return false;
			
	}

	public static void printPrime(int range) {
		for (int i = 2; i <=range; i++) {
			boolean test=primeCheck(i);
			if(test)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime(50);
	}

}
