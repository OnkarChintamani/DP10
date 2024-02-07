package com.arrays;

public class TraversArray {

	public static void main(String[] args) {
		int sum=0;
		int[] arr=new int[5];
		arr[0]=90;
		arr[1]=89;
		arr[2]=100;
		arr[3]=89;
		arr[4]=67;
		//arr[5]=90;// Exception
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		//array literal
		int[] arr1= {5,6,8,2,4}; //new int[] compiler auto.
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("------------------------------");
		for (int i = 0; i < arr.length; i++) {
			sum=arr[i]+sum;
		}
		System.out.println("sum: "+sum);

	}

}
