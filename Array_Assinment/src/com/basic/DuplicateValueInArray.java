package com.basic;

public class DuplicateValueInArray {
	static void FindDuplicate (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int dup=arr[i];

				if(arr[i]==dup)
					System.out.println(dup);
			
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,3,4,4,6,7,8};
		FindDuplicate(arr);
	}
}
