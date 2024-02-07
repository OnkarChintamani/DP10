package com.intermeditetask;

public class AlternatePrime {
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		else {
			boolean flag=true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int ct=0;
		int num=1;
		while(ct<arr.length) {
			if(checkPrime(num)) {
				arr[ct++]=num;
				num++;
			}else {
				num++;
			}
		}
		for(int i=2;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
