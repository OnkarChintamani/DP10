package com.intermeditetask;

public class FindUniqueChar {
	static void findUnique(char[] a1) {
		for (int i = 0; i < a1.length; i++) {
			int ct=0;

			for (int j = a1.length-1; j >=0; j--) {
				
				if(a1[i]==a1[j])
					ct++;
			}
			if(ct==1)
				System.out.println("Unique Elements :"+a1[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','d','e','d','f','f'};
		findUnique(arr);

	}

}
