package com.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class Person{
	String name;
	String dept;
	public Person(String name,String dept) {
		this.name=name;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dept=" + dept + "]";
	}
	
}

public class DuplicateElement3D {

	public static void main(String[] args) {
		List<Person>list=Arrays.asList(new Person("abhi","hr"),new Person("kanha","dev"),new Person("yuvi", "hr"),new Person("dina", "dev"));
		Map<Object,List<Person>>res=list.stream().collect(Collectors.groupingBy(i->i.dept));
		System.out.println(res);
	}

}
