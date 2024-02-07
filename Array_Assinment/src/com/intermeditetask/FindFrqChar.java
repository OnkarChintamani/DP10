package com.intermeditetask;

public class FindFrqChar {
	static void findFrq(char[] a1) {
		int ct;
		boolean flag;
		for (int i = 0; i < a1.length; i++) {
			ct=0;
			flag=false;
			for (int j =i-1; j >0; j--) {

				if(a1[i]==a1[j])
					flag=true;
				break;
			}
			if(flag==false)
			{
				for (int k = 0; k < a1.length; k++) {
					if(a1[i]==a1[k])
						ct++;
				}

			}
			System.out.println("Frqency of Character "+a1[i]+" is : "+ct);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','s','a','n','a','a','n','t'};
		findFrq(arr);

	}

}
