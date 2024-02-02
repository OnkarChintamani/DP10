package com.assinment.switchcase;

import java.util.Scanner;

public class MaxSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No. :");
		num1=sc.nextInt();
		System.out.println("Enter 1st No. :");
		num2=sc.nextInt();
		//res=num1<num2;
		switch (res) {
		case 1:if (num1>num2) {
			System.out.println(num1+": is Max");
		}	
			else 
				System.out.println(num2+": is Max");

			
			break;


		default:
			break;
		}
	}

}
