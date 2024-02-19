package com.inner.classes;

public class MemberOuterClass {
	private static int id; 
	private static String name;
	private static String name1;
	
	 public MemberOuterClass(int id, String name,String name1) {
		super();
		this.id = id;
		this.name = name;
		this.name = name1;
	}
	class Inner{  
	  void msg(int id) {
	  System.out.println("data is :"+id);
	  } 
	  void showData(String name,String name1) {
		  System.out.println("Student First Name:"+name);
		  System.out.println("Student Second Name:"+name1);
	  }
	 }  
	 public static void main(String[] args) {
		 MemberOuterClass mm = new MemberOuterClass(id, name,name1);
		 MemberOuterClass.Inner im =mm. new Inner();
		 im.msg(10);
		 im.showData("priya", "Thakur");
		 
		
	}
	

}
