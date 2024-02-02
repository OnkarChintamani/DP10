package com.assinment.switchcase;

public class LogicalOpratoerPrecidenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exp >4year, 2year programexp, cgpa>5.5
		int exp=5;
		int proexp=3;
		double gpa=5.5;
		if (( proexp>=2 || gpa>=5.5) && !(exp<=3)) {
			System.out.println("You are Pass For Interview");
		}
		else {
			System.out.println("You are Not Pass For Interview");
		}
	}

}
