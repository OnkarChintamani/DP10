package com.oops.statics;

public class Item {

	private int itemid;
	private String iname;
	private double cost;
	
	//satic double discount=0.1;
	static double discount;
	static String brand;
	static int icount=0;
	static {
		System.out.println("my grocery shop...");
		//called once
		System.out.println("Item added...");
		icount++;
		
	}
	static {
		System.out.println("Discount on all items ");
		discount =0.1;
		brand="Patangali";
		
	}
	{
		System.out.println(" in instance block");
		brand="Nastle";
		System.out.println("Item added...");
		icount++;

	}
	Item(){
		brand="saffola";
	}
	Item(int itemid,String iname,double cost){
		this.itemid=itemid;
		this.iname=iname;
		this.cost=cost;
	}
	//mutators and accessors
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String toString() {
		return "Item:"+itemid+"iname:"+iname+"cost:"+cost;
	}
//	public static void main(String[] args) {
//		System.out.println("in main");
//		Item i1= new Item();
//		Item i2=new Item(1, "good day", 90);
//	}
	
}
