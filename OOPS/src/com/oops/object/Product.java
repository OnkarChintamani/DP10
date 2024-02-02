package com.oops.object;

public class Product {

	private int pid,quant;
	private String pname;
	private double price;
	
	public Product(){
		
	}
	public Product(int pid,String pname,double price,int quant) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		this.quant=quant;
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double calTotalprice() {
		double totatlprice=quant*price;
		return totatlprice;
	}
	public double calDiscount(double discount) {
		double total=calTotalprice();
		double discountprice=total-(discount/100)*total;
		return discountprice;
	}
	public String toString() {
		return "pid :"+pid+"pname :"+pname+"price :"+price+"quntity :"+quant+"Total price"+calTotalprice();
	}
}
