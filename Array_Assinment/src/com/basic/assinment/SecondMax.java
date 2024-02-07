package com.basic.assinment;

import java.util.Iterator;

public class SecondMax {
	static void findSecondMax(int arr[]) {
	int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
