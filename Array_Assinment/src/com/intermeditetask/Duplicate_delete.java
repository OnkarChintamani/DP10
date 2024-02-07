package com.intermeditetask;

import java.util.Arrays;

public class Duplicate_delete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 1};
        
        int [] uniqueArray =removeDuplicates (array);
        
        System.out.println("Array after removing duplicates: ");
//        for 
//        (
//        		int i =0;i<uniqueArray.length;i++)
//        {
//        	//System.out.println(uniqueArray[i]+" ");
//        }
    	System.out.print(Arrays.toString(uniqueArray));

    }
    static int [] removeDuplicates(int[] array)
    {
    	int n =array.length;
    	for(
    			int i=0;i<n; i++)
    	{
    		for ( int j = i+1; j<n; j++)
    		{
    			if (array[i]==array[j])
    			{
    				for(int k=j;k<n-1;k++)
    				{
    					array [k]=array [k+1];
    				}
    				n--;
    				j--;
    			}
    		}
    	}
    	int [] uniqueArray = new int[n];
    	System.arraycopy(array,0,uniqueArray,0,n);
    	return uniqueArray;
    }
}
