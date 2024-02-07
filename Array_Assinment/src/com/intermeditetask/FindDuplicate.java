package com.intermeditetask;

import java.util.Arrays;

public class FindDuplicate {
	static void findDuplicate(int ar[]) {
		int count;
		boolean status;
		int k;
		int[] temp = new int[ar.length];
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					status = true;
					break;
				}
			}

			if (status == false) {
				for (k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {

						if (count != 1) {
							temp[index] = ar[k];
							index++;
						}
						count++;

					}
				}

			}
		}
		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 2, 3, 4, 1, 1, 2, 5, 6, 4, 7 };
		findDuplicate(ar);
	}

}
