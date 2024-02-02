package com.assinment.loops2;

public class NoOfSeries1 {
	public static void printNo() {
		int ans;
		for (int i = 1; i <=10; i++) {
			ans=1+(i*(i+1)/2);
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNo();
	}

}
