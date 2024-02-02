package com.oops.classobject;

public class Student {
	//instence variable
	//variable which is inside class but outside a method
	//instence variable can be access by any method which is present in class
	//instence variable have copy per object 
	int rollNo=101;
	String name="om";
	public void learn() {
		System.out.println("Students are learning :");
	}
	public void show() {
		System.out.println("Student Roll No Is : "+rollNo);
		System.out.println("Student Name is : "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.learn();
		s1.show();
		System.out.println("name :"+s1.name);//accessing or calling instance var

	}

}
