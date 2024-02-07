package com.intermeditetask;

import java.util.Arrays;
/*4>> WAP to left rotate the array
    ar={1,2,3,4,5}
    o/p: {3,4,5,1,2}*/
public class RotateArray {
	static void rotate(int[] arr) {
		int lEle=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];

		}
		arr[0]=lEle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		for(int i=1;i<4;i++) {
			rotate(arr);
		}
		System.out.println(Arrays.toString(arr));
	}

}
