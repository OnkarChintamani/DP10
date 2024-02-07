package com.intermedate;

public class ZeroShift {
	static void siftZero(int ar[]) {
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]!=0) {
				ar[count]=ar[i];
				count++;
			}
		}
		while(count<ar.length)
		{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
