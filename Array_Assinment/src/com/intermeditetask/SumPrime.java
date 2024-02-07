package com.intermeditetask;
//2>> Find the sum of prime numbers in array using enhanced for loop
public class SumPrime {
	static boolean findPrime(int n) {
		boolean flag=true;
		for (int i = 2; i < n/2; i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int sum=0;
		int [] arr= {3,5,8,10,3,7};
		for (int i : arr) {
			if (findPrime(i)) {
				sum+=i;
			}
		}
		System.out.println("Sum OF Prime No Is : "+sum);
	}

}
