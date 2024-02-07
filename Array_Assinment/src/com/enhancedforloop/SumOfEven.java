package com.enhancedforloop;

import java.util.Arrays;

public class SumOfEven {

	public static void main(String[] args) {
		
		int ar[]= {4,6,7,2,1,0};
		System.out.println(Arrays.toString(ar));
		int sum=0;
		for (int i : ar) {
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
