package com.arrays;

import java.util.Arrays;

public class FirstMidLast {
	
	static void sortArray(int[] ar) {
		for (int i = 1; i < ar.length/2; i++) {
			for (int j = ar.length/2+1; j < ar.length-1; j++) {
				
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {1,2,3,4,5,6,7,8,9,0,11};
			sortArray(arr);
	}

}
