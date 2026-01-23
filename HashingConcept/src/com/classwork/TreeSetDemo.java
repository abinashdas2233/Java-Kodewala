package com.classwork;

import java.util.TreeSet;

class Student implements Comparable<Student>{
	int id;
	String name;
	public Student(int id,String name) {
		this.name=name;
		this.id=id;
	}
	//for integer comparing (Comparing by id)
	/*@Override
	public int compareTo(Student o) {
	    return this.id-o.id;
	}*/
	
	@Override
	public int compareTo(Student o) {
	    return this.name.compareTo(o.name);
	}

	
	

	
	
}

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student>ts=new TreeSet<>();
		
		ts.add(new Student(1, "Abhi"));
		ts.add(new Student(3, "rajib"));
		ts.add(new Student(4, "nilesh"));
		
		for(Student i: ts) {
			System.out.println(i.id+" "+i.name);
		}
		
		
		
		
		
	}

}
