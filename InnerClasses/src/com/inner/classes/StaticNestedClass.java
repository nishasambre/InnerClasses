package com.inner.classes;

public class StaticNestedClass {
	 static int a =10;
	 static String value ="45";
	 static class Inner{
	static void msg() {
		System.out.println("value of a :"+a);
	}
	static void dataValue() {
		System.out.println("Here is value of string:"+value);
	}
	
	public static void main(String[] args) {
	  StaticNestedClass.Inner.msg();
	  StaticNestedClass.Inner.dataValue();
		
		
	}
	

}
}