package com.assinment.conditionalstatements;

import java.util.Scanner;

public class CalculateNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int amount;
		int n2000=0;
		int n500=0;
		int n200=0;
		int n100=0;
		int n50=0;
		int n20=0;
		int n10=0; 
		System.out.println("Enter The Amount :");
		amount=sc.nextInt();
		if(amount>=1000) {
			n2000=amount/2000;
			amount=amount-n2000*2000;
		}
		if(amount>500) {
			n500=amount/500;
			amount=amount-n500*500;
		
		}
			
			if (amount>200) {
				n200=amount/200;
				amount=amount-n200*200;
				
			}
			if (amount>=100) {
				n100=amount/100;
				amount=amount-n100*100;
				
			}
			if (amount>=50) {
				n50=amount/50;
				amount=amount-n50*50;
				
			}
			if (amount>=20) {
				n20=amount/20;
				amount=amount-n20*20;
				
			}
			if (amount>=10) {
				n10=amount/10;
				amount=amount-n10*10;
				
			}
			else {
				//System.out.println("Enter valid no.");
			}
			System.out.println(n2000+": Notes of 2000");
			System.out.println(n500+" : Notes of 500");
			System.out.println(n200+" : Notes of 200");
			System.out.println(n100+" : Notes of 100");
			System.out.println(n50+"  : Notes of 50");
			System.out.println(n20+"  : Notes of 20");
			System.out.println(n10+"  : Notes of 10");


		
		
	}

}
