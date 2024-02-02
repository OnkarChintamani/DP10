package com.oops.containment;

import java.util.Scanner;

public class Country {
	Scanner sc=new Scanner(System.in);
	public void enterCities(Cities c) {
		System.out.println("enter city_id :");
		c.setCtid(sc.nextInt());
		System.out.println("enter city_name:");
		c.setCtname(sc.next());
		
//		States s=new States();
//		
//		System.out.println("enter states_id:");
//		s.setStid(sc.nextInt());
//		System.out.println("enter states_name:");
//		s.setStname(sc.next());
		
		c.setStates(new States());
		//c.getStates().
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country coun=new Country();
		
		Cities c1=new Cities();

		States s1=new States();
		coun.enterCities(c1);
		States s2=new States();
		
		//Cities c1=new Cities();
		Cities c2=new Cities();
		Cities c3=new Cities();
		Cities c4=new Cities();
		Cities c5=new Cities();
		
		System.out.println(c1);

		
		/*System.out.println(c1);
		System.out.println("--------------------------");
		System.out.println(c2);
		System.out.println("--------------------------");
		System.out.println(c3);
		System.out.println("--------------------------");
		System.out.println(c4);
		System.out.println("--------------------------");
		System.out.println(c5);
		System.out.println("--------------------------");*/


	}

}
