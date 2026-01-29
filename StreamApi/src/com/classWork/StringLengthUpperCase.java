package com.classWork;

import java.util.Arrays;
import java.util.List;

public class StringLengthUpperCase {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("abinash","kana","hitesh","naveen");
		
		System.out.println("upperCase-");
		list.stream().map(i->i.toUpperCase()).forEach((i)->System.out.println(i));
		System.out.println("Lengths-");
		list.stream().map(i->i.length()).forEach((i)->System.out.println(i));
		

	}

}
