package com.basic;

public class SearchElement {
	static void searchElement(int[] arr,int element) {
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element) {
				flag=true;
				System.out.println("Element Present in Position: "+i);
			}
		}
		if(flag!=true) 
			System.out.println("Element Is Not Present.");
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,4,6,7,4};
		searchElement(arr, 4);
	}

}
