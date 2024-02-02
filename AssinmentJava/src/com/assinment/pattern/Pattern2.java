package com.assinment.pattern;

public class Pattern2 {
	public static void patt1(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if (j%2==0) 
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	public static void patt2(int n) {
		for (int i = 0; i <= n; i++) {
			
		for (int j = 0; j <= i; j++) {
			if(j%2==0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
		}
	}
	public static void patt3(int n) {
		int temp=1;
		for (int i = 0; i <n; i++) {
	
			for (int j = 0; j <n; j++) {
				
				System.out.print(temp);

				if(temp==1)
					temp=0;
				else
					temp=1;
				
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
