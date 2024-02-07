package com.freq;

public class Frequancy {
	static void findFrequency(int[]ar) {
		int count;
		boolean status;
		for (int i = 0; i < ar.length; i++) {
			count=0;
			status=false;
			//check if the element is new
			for (int j = i-1; j >= 0; j--) {
				if(ar[i]==ar[j]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for (int k = 0; k < ar.length; k++) {
					if(ar[i]==ar[k])
						count++;
				}
				//frequency
				System.out.println(ar[i]+"--->"+count);
				//duplicate
//				if(count>1) {
//					System.out.println("Duplicate: "+ar[i]);
//				}
				//unique
				if(count==1)
					System.out.println("Unique"+ar[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,1,5,2,3,6,7,8,8,7,9,100};
		findFrequency(arr);
	}

}
