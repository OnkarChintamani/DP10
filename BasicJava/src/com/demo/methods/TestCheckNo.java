package com.demo.methods;

import java.util.Scanner;

public class TestCheckNo {
	//public static int countNo(int n) {
	//	return count;
		
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int num;
			
			char ch='a';

			do {
			System.out.println("Eneter the No :");
			num=sc.nextInt();
			int count=0,count1=0,count2=0;
			if(num==0)
			{
				count++;
				System.out.println(count+" positive");

			}
			if(num>0) {
				count1++;
				System.out.println(count1);

			}
			if(num<0) {
				count2++;
				System.out.println(count2);

			}
			System.out.println(count);
			
			System.out.println("if you want to continue the enter y ");
			ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
			//countNo(num);

			
	}

}
