package com.oops.interfaces;
interface Payment{
	void payment(double pay);
}
class Cake implements Bakery,Payment{
	public void bake() {
		System.out.println("varity: Buterscotch, chocolate,vanilla");
	}
	public void minOrder() {
		System.out.println("500gm");
	}
	@Override
	public void payment(double pay) {
		System.out.println("payment :"+pay);
	}
}
class Biscuit implements Bakery{
	public void bake() {
		System.out.println("varity: Chocochips, chocolate,Cream");
	}
	public void minOrder() {
		System.out.println("1kg");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t"+Bakery.name);
		System.out.println("------------******------------");
		Bakery b;
		Payment p=new Cake();
		b=new Cake();
		b.bake();
		b.minOrder();
		p.payment(200);
		System.out.println("-------------------------");
		b=new Biscuit();
		b.bake();
		b.minOrder();
		
		
		
	}

}
