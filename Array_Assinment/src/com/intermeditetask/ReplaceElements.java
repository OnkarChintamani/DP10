package com.intermeditetask;

import java.util.Arrays;
/*5>> WAP to replace the negative elements in an array with immendiate left elements square
    ar={1,2,-3,2,-4,-6}
    o/p={1,2,4,2,4,16}
    here -> -3 is replaced by square of 2 which is 4*/
public class ReplaceElements {
	static void replaceEements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				
				arr[i]=arr[--i]*arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		int [] arr={1,2,-3,2,-4,-6};
		replaceEements(arr);
	}

}
