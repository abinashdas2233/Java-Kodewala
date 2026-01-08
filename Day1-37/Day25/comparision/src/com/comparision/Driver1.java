package com.comparision;
class Person{
	String name;
	public Person(String name) {
		this.name=name;
	}
}

public class Driver1 {

	public static void main(String[] args) {
		Person p1=new Person("abhi");
		Person p2=new Person("abhi");
		
		System.out.println(p1==p2);//false,because due to separate memory address
		System.out.println(p1.equals(p2));//false,because due to compareing memory address not content;

	}

}
