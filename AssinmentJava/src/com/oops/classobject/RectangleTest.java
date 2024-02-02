package com.oops.classobject;

public class RectangleTest {
	double length;
	double width;
	double ans;
	double per;


	public void setValue(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	public double areaRect(){
		ans=length*width;
		return ans;
	}
	public double perimeterRec() {
		per=2*(length+width);
		return per;
	}
	public void showValue() {
		System.out.println("Length is :"+length);
		System.out.println("Width is :"+width);
		System.out.println("Area of Rectangle is :"+ans);
		System.out.println("Perimeter of Rectangle is :"+per);
	}
}
