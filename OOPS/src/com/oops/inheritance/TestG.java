package com.oops.inheritance;

 class G3g {
	 String msg="parent";
	 int value;
	 public G3g(int value) {
		this. value = value;
	 }
	public static void fech() {
		System.out.println("3G have speed 10mbps");
	}

}
 class G4g extends G3g{
	 String msg="child";
	 public G4g(int value,int data) {
		 super(value);
		 System.out.println("Value :"+value+"data: "+data);
	 }
	 public  void fech1() {
		 String msg="local";
		 System.out.println("4G have 30mbs speed");
		 System.out.println("MSG: "+msg);
		 System.out.println("MSG: "+this.msg);
		 System.out.println("MSG: "+super.msg);
	 }
	
 }
public class TestG{
	public static void main(String[] args) {
		G4g g1=new G4g(3,1);
		//super.value;
		g1.fech1();
	//	g1.fech();
	}
}