package com.oops.constructor;
//constrctor with diff. parameters.
//in counstructor overloading we can not take same constructor multiple times
public class Customer {
	private int cid;
	private String cname;
	private String cemail;
	private String ccontact;
	
	public Customer() {
		
	}
	//add customer
	public Customer(String cname,String cemail,String ccontact) {
		this.ccontact=ccontact;
		this.cemail=cemail;
		this.cname=cname;
	}
	
	//update
	public Customer(int cid,String cname,String cemail,String ccontact) {
		this.ccontact=ccontact;
		this.cemail=cemail;
		this.cname=cname;
		this.cid=cid;
	}

	public Customer(int cid) {
		this.cid=cid;
	}
	public void show() {
		System.out.println("Customer ID : "+cid);
		System.out.println("Customer Nmae : "+cname);
		System.out.println("Customer Email : "+cemail);
		System.out.println("Customer Contact : "+ccontact);

	}
}
