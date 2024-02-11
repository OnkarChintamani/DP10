package com.array2dassinment;
//3.3.	WAP to print maximum in rowwise in 2D array.
//Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{22,31,9},{12,25,16}, {34, 42, 2}};
		int max=arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]<max)
						System.out.print("Max Element In Row "+(i+1)+" is :"+arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
