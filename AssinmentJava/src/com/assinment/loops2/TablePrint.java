package com.assinment.loops2;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,table;
		Scanner sc=new Scanner(System.in);
		System.out.println("give no :");
		n=sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			table=n*i;
			System.out.println(table);
		}

	}

}
