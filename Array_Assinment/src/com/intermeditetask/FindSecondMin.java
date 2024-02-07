package com.intermeditetask;

//3>Find the second minimum number in an array without sorting
public class FindSecondMin {
	static int findSecondHighest(int ar[]) {
		int min=Integer.MAX_VALUE; //ar[1]
		int smin=Integer.MAX_VALUE;
		for(int x: ar) {
			if(x<min) {
				smin=min;
				min=x;
			}
			else if(x<smin) {
				smin=x;
			}
		}
		return smin;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,5,3,6,2,8,9,47,464};
		int s=findSecondHighest(arr);
		System.out.println("Second Minimum :"+s);
	}

}
