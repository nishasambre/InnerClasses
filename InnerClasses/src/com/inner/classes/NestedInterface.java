package com.inner.classes;

public interface NestedInterface {
	void show();  
	  interface Message{  
	   void msg();  
	  }  
	  class Showable implements NestedInterface.Message{

		@Override
		public void msg() {
			System.out.println("student data..");
			
		}  
		
	public static void main(String[] args) {
		NestedInterface.Message message=new Showable();//upcasting here  
		  message.msg();  
	}

}
}