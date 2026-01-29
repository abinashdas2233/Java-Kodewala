package com.classWork;

import java.util.Arrays;
import java.util.List;

public class FindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	List<String> items=Arrays.asList("Apple","cat","dog","animal");
		items.stream().filter(i->i.length()>3).forEach(i->System.out.println(i));

	}

}
