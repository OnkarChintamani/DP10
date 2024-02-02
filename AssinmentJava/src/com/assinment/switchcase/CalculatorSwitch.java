package com.assinment.switchcase;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int res;
		System.out.println("-----Calculator-----");
		System.out.println("Enter 1st No.");
		num1=sc.nextInt();
		System.out.println("Enter 2nd No.");
		num2=sc.nextInt();
		System.out.println("-----Choose_Oprations-----");
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divition");
		System.out.println("Enter The No.");
		res=sc.nextInt();
		switch (res) {
		case 1:
			res=num1+num2;
			 System.out.println(num1+" + "+num2+"\n: "+res);
			break;
		case 2:
			res=num1-num2;
			 System.out.println(num1+" - "+num2+"\n: "+res);
			break;
		case 3:
			res=num1*num2;
			 System.out.println(num1+" * "+num2+"\n: "+res);
			break;
		case 4:
			res=num1/num2;
			 System.out.println(num1+" / "+num2+"\n: "+res);
			break;
		default:
			break;
		}
	}

}
