package com.oops.classobject;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		b1.setDetails(1, "Harry Potter 1", 1000);
		b2.setDetails(2, "Harry Potter 2", 2000);
		b3.setDetails(3, "Harry Potter 3", 3000);
		b1.showDetails();
		b2.showDetails();
		b3.showDetails();
		
	}

}
