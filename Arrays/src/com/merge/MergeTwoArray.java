package com.merge;

import java.util.Arrays;

public class MergeTwoArray {
	static int[] mergeArray(int[] a1,int[] a2) {
		int len1=a1.length;
		int len2=a2.length;
		int[] mer = new int[len1+len2];
		int index=0;
		for (int i = 0; i < a1.length; i++) {
			mer[index++]=a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			mer[index++]=a2[i];
		}
		return mer;
	}
	static int[] mergeAlternateSkip(int[] a1,int[] a2) {
		int len1=a1.length;
		int len2=a2.length;
		int maxLength= Math.max(len1, len2);
		int[] mar=new int[maxLength];
		int index=0;
		int i=0;
		while(i<maxLength) {
			if(i<a1.length	) {
				mar[index++]=a1[i++];
			}
			if(i<a2.length) {
				mar[index++]=a2[i++];
			}
		}
		return mar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {2,4,6,7,6,4};
		int[] ar2= {10,40,60,30,10};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));

		System.out.println("After merging :");
		int[] m=mergeArray(ar1, ar2);
		System.out.println(Arrays.toString(m));
		System.out.println("Alternate skip:");
		int[] m1=mergeAlternateSkip(ar1, ar2);
		System.out.println(Arrays.toString(m1));
	}

}
