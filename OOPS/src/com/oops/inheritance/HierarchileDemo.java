package com.oops.inheritance;

import java.util.Scanner;

class Bilding{
	private int bfloor;
	protected String baddress;
	public Bilding() {
		
	}
	public Bilding(int bfloor,String baddress) {
		this.bfloor=bfloor;
		this.baddress=baddress;
	}
	public int getBfloor() {
		return bfloor;
	}
	public void setBfloor(int sid) {
		this.bfloor = sid;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String sname) {
		this.baddress = sname;
	}

}
class School extends Bilding{
	private int schoolId;
	public String schooName;
	public School() {
		
	}
	public School(int sid,String sname,int schoolId,String schoolName) {
		super(sid,sname);
		this.schoolId=schoolId;
		this.schooName=schooName;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String Bilding() {
		return "Bilding :"+getBfloor()+" "+baddress+" School: "+schoolId+" "+schooName;
	}
}
class College extends Bilding{
	private int cid;
	public String cname;
	public College() {
		
	}
	public College( int sid,String sname, int cid,String cname) {
		super(sid,sname);
		this.cid=cid;
		this.cname=cname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String toString() {
		return "Student :"+getBfloor()+" "+baddress+" College :"+" "+cid+" "+cname;
	}
}
public class HierarchileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		School s1=new School(1, "onkar", 101, "SSVMP");
		System.out.println(s1);
		College c1=new College();
		System.out.println("Enter student id :");
		c1.setBfloor(sc.nextInt());
		System.out.println("Enter student name :");
		c1.setBaddress(sc.next());
		System.out.println("Enter College id :");
		c1.setCid(sc.nextInt());
		System.out.println("Enter college name:");
		c1.setCname(sc.next());
		System.out.println(c1);
	}

}
