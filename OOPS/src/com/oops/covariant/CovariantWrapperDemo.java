package com.oops.covariant;

public class CovariantWrapperDemo {
	class First{
//		Number value;
//		Number  displayValue() {
//			value =10;
//			return value;
//		}
		
		Object value;
		Object displayValue() {
			value=10;
			return value;
		}
		
	}
	class Second extends First{
		Integer myvalue;
		Integer disolayValue() {
			myvalue=20;
			return myvalue;
		}
	}
	class Third extends First{
		Character ch;
		Character displayValue() {
			ch='A';
			return ch;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f;
	}

}
