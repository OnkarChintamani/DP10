package com.intermeditetask;

import java.util.Arrays;

public class MergeTwoArrays {
	static void margeArray(int[] ar1,int[] ar2) {
		int len1=ar1.length;
		int len2=ar2.length;
		int index=0;
		int[] max=new int[len1+len2];
		for (int i = 0; i < ar1.length; i++) {
			max[index++]=ar1[i];
		}
		for (int i = 0; i < ar2.length; i++) {
			max[index++]=ar2[i];
		}
		System.out.println(Arrays.toString(max));
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
		int[] ar1= {1,2,3};
		int[] ar2= {4,5,6,7,8};
		int[] a=mergeAlternateSkip(ar1, ar2);
		System.out.println(Arrays.toString(a));
		margeArray(ar1, ar2);

	}

}
