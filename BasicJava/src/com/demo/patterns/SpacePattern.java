package com.demo.patterns;

public class SpacePattern {
	public static void patt1(int n) {
		int k;
		for (int i = 1; i <=n; i++) {
			for ( k = n-1; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void patt2(int n) {
		int k;
		for (int i = 1; i <=n; i++) {
			for (k = 1;  k<i;k++) {
				System.out.print(" ");
			}
			for (int j = n; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(5);
		System.out.println();
		patt2(5);
	}

}
