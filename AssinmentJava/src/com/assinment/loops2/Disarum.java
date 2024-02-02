package com.assinment.loops2;

import java.util.Scanner;

public class Disarum {
	public static int digit(int num){
		int count=0;
		while (num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static int basePow(int num,int pow) {
		int ans=1;
		for (int i = 1; i <=pow; i++) {
			ans=ans*num;
		}
		return ans;
	}
	public static boolean addNum(int num) {
		int ans=0,rem; int pow=digit(num);
		int org=num;
			while (num!=0) {

			rem=num%10;
			ans+=basePow(rem, pow);
		//	System.out.println(ans);
				pow--;
			num=num/10;		
			

		}
			if(org==ans);

		return true; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
			System.out.println("Enter the NO : ");
			num=sc.nextInt();
			
		//System.out.println(num);
		//num=digit(num);
		//System.out.println(digit(num)+" hi");
		//num=addNum(135);
			
		if (addNum(num)) {
			System.out.println(": Disarium No.");
		}
		else
			System.out.println(": not Disarium No.");
		
		//System.out.println(num);
	}

}
