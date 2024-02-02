package com.assinment.pattern;

public class Pattern1 {
	
		public static void patt1(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("1 ");
				}
				System.out.println();
			}
		}
		public static void patt2(int n) {
			for (int i = n; i>0 ; i--) {
				for (int j = 1; j <=i ; j++) {
					System.out.print("# ");
				}
				System.out.println();
			}
		}
		public static void patt3(int n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("@ ");
				}
				System.out.println();
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(4);
		System.out.println();
		patt2(4);
		System.out.println();
		patt3(4);
	}

}
