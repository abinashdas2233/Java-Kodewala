package com.classwork;

import java.util.HashSet;
import java.util.Objects;

class Person{
	int id;
	String name;
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			//incoming object null or not
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		 Person p=(Person)obj;
		return this.id==p.id && name.equals(p.name);
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
}

public class Practice {
	public static void main(String[] args) {
		Person e1= new Person(1, "abhi");
		Person e2=new Person(1,"abhi");
		Person e3=new Person(1,"das");
		HashSet<Person>hs=new HashSet<Person>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(hs.contains(e2));
		
	}

}
