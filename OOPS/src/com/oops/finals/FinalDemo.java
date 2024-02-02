package com.oops.finals;

class Devloper{
	int id;
	String name;
	final static int noHours;
	final String panNo;
	static{
		noHours=8;
	}
	Devloper(){
		this.panNo="Unkown";
	}
	Devloper(int id, String name,String panNo){
		this.id=id;
		this.name=name;
		this.panNo=panNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getNohours() {
		return noHours;
	}
	public String getPanNo() {
		return panNo;
	}
}
class FullStack extends Devloper{
//	void basicSiklls() {
//		System.out.println("HTML,CSS,Java");
//	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devloper d1=new Devloper(1, "om", "DXSEF4426G");
		System.out.println(d1.id+" "+d1.name+" "+d1.panNo);
	}

}
