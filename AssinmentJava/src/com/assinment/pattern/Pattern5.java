package com.assinment.pattern;

public class Pattern5 {
	public static void patt1(int n) {
		int temp=5;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(temp);
			}
			System.out.println();
			temp--;
		}
	}
	public static void patt2(int n) {
		for (int i = 0; i < n; i++) {
			char ch='A';
			for (int j = 0; j <= i; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	public static void patt3(int n) {
		char ch='A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch +" ");
			}
			System.out.println();
			ch++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(5);
		patt2(5);
		patt3(5);
	}

}
