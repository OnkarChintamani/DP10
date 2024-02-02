package com.oops.classobject;

public class Book {
	int bid;
	String bname;
	double bprice;
	public void setDetails(int bookid,String bookname,double bookprice) {
		bid=bookid;
		bname=bookname;
		bprice=bookprice;
		
	}
	public void showDetails(){
		System.out.println("Book ID    : "+bid);
		System.out.println("Book Name  : "+bname);
		System.out.println("Book Price : "+bprice);
		System.out.println("-------------------------");
	}

}
