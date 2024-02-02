package com.oops.constructor;
//Instance Initilaizer Block(anonymous bolck)
public class Movie {

	private int movieid;
	private String moviename;
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB2");
	}
	public Movie(int movieid,String moviename) {
		this.movieid=movieid;
		this.moviename=moviename;
		System.out.println("movie_id: "+movieid+" "+"movie_name: "+moviename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie(1, "12th fail");
		Movie m2=new Movie(2,"SamBahadur");
	}

}
