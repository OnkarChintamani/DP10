package com.arrays;

public class ArrayLogicFindNo {
static boolean searchElement(int ar[],int ele) {
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]==ele)
			return true;
	}
	return false;
}
static void searchElementOccurences(int ar[],int ele) {
	boolean flag=false;
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]==ele) {
			flag=true;
			System.out.println("Position:"+i);
		}
	}
	if(!flag)
		System.out.println("Element not found");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,4,5,7,6,4,1,0};
		if(searchElement(arr, 6))
			System.out.println("Element Found.");
		else
			System.out.println("Element not Found.");
		
		searchElementOccurences(arr, 6); 
			
			
	}
	
}
