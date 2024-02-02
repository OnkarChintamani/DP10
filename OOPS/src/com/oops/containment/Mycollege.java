package com.oops.containment;

public class Mycollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1=new Course(1,"java",10000);
		Course c2=new Course(2,".net",20000);
		Course c3=new Course(3,"python",30000);
		//Course c4=new Course(4,"jscript",40000);
		//Course c5=new Course(5,"css",50000);
		
		Student s1=new Student(1, "om", 80, c2);
		Student s2=new Student(2, "onkar", 90, c1);
		Student s3=new Student(3, "ram", 95, c3);
		Student s4=new Student(4, "sham", 75, c2);
		Student s5=new Student(5, "mahesh", 85, c1);
	
		System.out.println(s1);
		c1.setFee(50000);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		Student s6=new Student(6, "anand", 78,new Course(4, "MERN", 80000));
		System.out.println(s6);
		 System.out.println("-----------------------------------------------");
		s2.setCourse(c3);
		System.out.println(s2);
	}

}
