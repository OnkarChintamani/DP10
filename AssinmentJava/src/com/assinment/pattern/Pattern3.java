package com.assinment.pattern;

public class Pattern3 {
	public static void patt1(int n) {
		for (int i = 0; i <n ; i++) {
			int temp=1;
			for (int j = 0; j <i; j++) {
				System.out.print(temp++);
			}
			System.out.println();
		}
	}
	public static void patt2(int n) {
		int temp=0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(temp);
			}
			System.out.println();
			temp++;
		}
	}
	public static void patt3(int n) {
		int temp=1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
			
				System.out.print(temp++ +" " );
			
			}
			System.out.println();
	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(5);
		System.out.println();
		patt2(5);
		System.out.println();
		patt3(5);
	}

}
