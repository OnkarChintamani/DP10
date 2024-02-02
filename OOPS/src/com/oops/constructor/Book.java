package com.oops.constructor;

public class Book {
	private int bookid;
	private String bookname;
	private double bookprice;
	
	public Book(){
		
	}
	public Book(int bookid,String bookname,double bookprice) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
	}
	public void setBookid(int bookid) {
		this.bookid=bookid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookname(String bookname) {
		this.bookname=bookname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookprice(double bookprice) {
		this.bookprice=bookprice;
	}
	public double getBookprice() {
		return bookprice;
	}
	//it gives String Repersentation of an object
	public String toString() {
		return "book id :"+bookid+"\nbook name :"+bookname+"\nbook price :"+bookprice;
	}
}
