package com.arraysobject;

import java.util.Scanner;

public class StudentArrayUserInput {
	static Scanner sc=new Scanner(System.in);
	static void enterStudentDetails(Student s1) {
		System.out.println("Enter student id:");
		s1.setSid(sc.nextInt());
		System.out.println("Enter student name:");
		s1.setSname(sc.next());
		System.out.println("Enter student marks:");
		//s1.setMarks(sc.nextDouble());
	}
	static void displayDetailes(Student[] s) {
		for(Student s1 : s) {
			System.out.println(s1);
		}
	}
	static void sortMarks(Student st[]) {
		Student stmp=new Student();
		for (int i = 0; i < st.length; i++) {
			for (int j = i+1; j < st.length; j++) {
				stmp=st[i];
				st[i]=st[j];
				st[j]=stmp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s1=new Student[3];
		
		for (int i = 0; i < s1.length; i++) {
			s1[i]=new Student();
			enterStudentDetails(s1[i]);
		}
		displayDetailes(s1);
		//s1[0].setSid(101);
		//s1[0].setMarks(88);
		//s1[0].setSname("om");
//		s1[1].setSid(102);
//		s1[1].setMarks(98);
//		s1[1].setSname("onkar");
//		s1[2].setSid(103);
//		s1[2].setMarks(78);
//		s1[2].setSname("anand");
//		for(int i=0;i<s1.length;i++)
//		{
//			System.out.println("Enter Student id:");
////			int id=sc.nextInt();
////			s1[i].setSid(id);
//			s1[i].setSid(sc.nextInt());
//			System.out.println("Enter student name:");
//			s1[i].setSname(sc.next());
//			System.out.println("Enter Student marks:");
//			s1[i].setMarks(sc.nextDouble());
//		}

	}


}
