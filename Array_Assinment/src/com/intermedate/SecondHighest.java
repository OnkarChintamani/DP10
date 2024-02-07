package com.intermedate;

public class SecondHighest {
	static int findSecondHighest(int ar[]) {
		int highest=Integer.MIN_VALUE; //ar[0]
		int sHighest=Integer.MIN_VALUE;//ar[0]
		for(int x: ar) {
			if(x>highest) {
				sHighest=highest;
				highest=x;
			}
			else if(x>sHighest) {
				sHighest=x;
			}
		}
		return sHighest;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,5,3,6,2,8,9,47,464};
		int s=findSecondHighest(arr);
		System.out.println("Second Highest :"+s);
	}

}
