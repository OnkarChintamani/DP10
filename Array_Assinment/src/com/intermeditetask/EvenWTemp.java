package com.intermeditetask;

import java.util.Arrays;
//3>>Shift all the even number at the end of array w/o using temporary array
public class EvenWTemp {
	static void findEven(int[] ar) {
		{
			for(int i=0;i<ar.length;i++)
			{
				for(int j=ar.length-1;j>=0;j--)
				{
					if(ar[i]%2==0 &&i<j)
					{
						int temp=ar[j];
						ar[j]=ar[i];
						ar[i]=temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,7,8,9,3};
		findEven(arr);
		System.out.println(Arrays.toString(arr));
	}

}
