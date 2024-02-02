package com.assinment.conditionalstatements;

import java.util.Scanner;

public class MaxPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cs;
		int be;
		int me;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Placements CS");
		cs=sc.nextInt();
		System.out.println("Enter Total Placements BE");
		be=sc.nextInt();
		System.out.println("Enter Total Placements ME");
		me=sc.nextInt();
		if(cs>0 && be>0 && me>0) {
			if (cs>be && cs>me) {
				System.out.println(": CS Placements are Max");
			}
			else if (be>cs && be>me) {
				System.out.println(": BE Placements are Max");
			}
			else if (me>be && me> cs) {
				System.out.println(": ME Placements are Max");

			}
			else if (cs==be && cs>me) {
				System.out.println(": Highest Placement In CS ");
				System.out.println(": Highest Placement In BE");
			}
			else if (be==me && be>cs) {
				System.out.println(": Highest Placement In BE ");
				System.out.println(": Highest Placement In ME");
			}else if (me==be && me>cs) {
				System.out.println(": Highest Placement In ME ");
				System.out.println(": Highest Placement In BE");
			}else if (cs==me && me>be) {
				System.out.println(": Highest Placement In CS ");
				System.out.println(": Highest Placement In BE");
			}
			else {
				System.out.println(": All Braches Have Same No. Placements");
			}
		}
		else {
			System.out.println("Enter Valid Placement No.");
		}
	}

}
