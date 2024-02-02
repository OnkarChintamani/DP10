package com.oops.getset;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setDetails(1, "om", 80);
		s1.showDetails();
		s1.setSid(10);
		System.out.println(s1.getSid());
		s1.setSname("omkar");
		System.out.println(s1.getSname());
		s1.setSmarks(90);
		System.out.println(s1.getSmarks());
		s1.showDetails();
	}

}
