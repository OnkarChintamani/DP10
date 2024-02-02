package com.assinment.pattern;

public class Pattern7 {
	public static void patt1(int num) {
		int n=1;
		for (int i = num; i >=1; i--) {
			n=1;

			for (int j = num; j >=i; j--) {

				System.out.print(n);
				//n--;
			}
			System.out.println();
			n++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patt1(5);
	}

}
