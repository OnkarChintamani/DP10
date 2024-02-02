package com.assinment.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 1 to 50 if 3 hi if 9 hello
		//1 2 hi 4 5 hi 7 8 hello 10 11 hi
		
		for (int i = 0; i <=50; i++) {

			if (i%3==0 && i%9!=0) 
				System.out.println("hi");
			
			
				else if (i%9==0) 
				System.out.println("hello");

			else
				System.out.println(i);

					
		
	}

}
}
