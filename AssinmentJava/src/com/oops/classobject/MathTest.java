package com.oops.classobject;
class MathDemo{
	public int square(int n) {
		return n*n;
	}
	public int cube(int n) {
		return n*n*n;
	}
}

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathDemo c1=new MathDemo();
		int sqr=c1.square(2);
		int cub=c1.cube(3);
		System.out.println("Square : "+sqr);
		System.out.println("Cube : "+cub);

	}

}
