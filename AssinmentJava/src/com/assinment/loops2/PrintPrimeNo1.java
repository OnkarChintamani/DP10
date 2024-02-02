package com.assinment.loops2;

public class PrintPrimeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num = 400;  
	    int count; 
	    for (int i = num; i >= 2; i--) {
	      count = 0;  

	      for (int j = 2; j <= i / 2; j++) {
	        if (i % j == 0) {
	          count++;  
	          break; 
	        }
	      }

	      if (count == 0) {
	        System.out.println(i);  
	      }
	    }
	  }
	

	}


