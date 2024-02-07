package com.intermeditetask;

import java.util.Arrays;

//6> Shift zeros at the beginning of array
public class ShiftZeros {
	static void shiftZeros(int ar[]) {
		int count = ar.length-1;
		for (int i = 0; i < ar.length-1; i++) {
			if (ar[i] != 0) {
				ar[count] = ar[i];
				count--;
			}
		}
		while(count>=0)
		{
				ar[count--] = 0;			
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 9, 5, 0, 7 };
		shiftZeros(arr);
	}

}
