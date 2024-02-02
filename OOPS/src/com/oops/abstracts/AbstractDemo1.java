package com.oops.abstracts;
abstract class Language{
	abstract void details();
	//can have both abstract and concrete methods
	void show() {
		System.out.println("Language");
	}
	
}
class ProgLanguage extends Language{
	void details() {
		System.out.println("JAVA,C++,C,C#,JSCRIPT");
	}
	void display(String name) {
		System.out.println("Institude:"+name);
	}
	
}
class SpekingLang extends Language{
	void details() {
		System.out.println("MARATHI,HINDI,ENGLISH,SANSKRUT");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can not create object of abstract class
	//	Language l1 = new Language();
		Language lang;
		lang=new ProgLanguage();
		lang.details();
		lang.show();
		System.out.println("----------------------");
		lang=new SpekingLang()	;
		lang.details();
	}

}
