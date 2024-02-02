package com.assinment.pattern;

public class Pattern6 {
	public static void patt1(int num) {
		char cha='A';

		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(cha++ +" ");
			}
			System.out.println();
			//cha++;
		}
	
	}
	public static void patt2(int num) {
		//int no=0;
		for (int i = 0; i <= num; i++) {
			//no=0;
			for (int j = 0; j <= i; j++) {
				System.out.print(j+" ");
				//no++;
			}
			System.out.println();
		
		}
	}
	public static void patt3(int num) {
	
		for (int i = num; i >=1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(4);
		patt2(4);
		System.out.println();
		patt3(5);
	}

}
