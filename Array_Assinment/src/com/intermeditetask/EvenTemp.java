package com.intermeditetask;

import java.util.Arrays;

public class EvenTemp {
	static void findEven(int[] ar) {
		
			int[] temp=new int[ar.length];
			for(int i=0;i<ar.length;i++)
			{
				for(int j=ar.length-1;j>=0;j--)
				{
					if(ar[i]%2==0 &&i<j)
					{
						int t=ar[j];
						ar[j]=temp[i];
						temp[i]=t;
					}
				}
			}
		System.out.println(Arrays.toString(ar));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,8,7,9,2,1};
		findEven(arr);
	}

}
