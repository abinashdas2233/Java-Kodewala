package com.learn;

public class ObjectCount {
	static int count=0;
	
	
	/*public ObjectCount() {
		count++;
	}*/
	
	//instead of constructor we can increase the count of object through IIB
	{
		count++;
	}
	public static void main(String[]args) {
		
		ObjectCount person1=new ObjectCount();
		ObjectCount person2=new ObjectCount();
		ObjectCount person3=new ObjectCount();
		System.out.println("object created "+count+"times.");
		
	}

}
