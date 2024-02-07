package com.basic;

public class PrimeArray {
	static boolean prime(int a) {
		boolean flag = true;
		int i;
		for (i = 2; i <= a / 2; i++) {

			if (a % i == 0) {
				flag = false;
				break;
			}

		}
		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 7, 8, 4 };
		for (int i = 0; i < arr.length; i++) {
			if(prime(arr[i]))
				System.out.println(arr[i]+"prime no.");
			else
				System.out.println(arr[i]+"not prime.");
		}
	}

}
