package com.classWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Words {
	public static void main(String[] args) {
		String str="Gaurav";
		str.chars().mapToObj(i->(char)i).forEach(i->System.out.println(i));
		
		
		//find frequency of each character
		str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()))
		.entrySet()
		.stream().forEach(i->System.out.println(i.getKey()+"->"+i.getValue()));
		
		//List of string sort by length
		List<String>list=Arrays.asList("Kanha","Abinash","Nikhil","Aswini","deep");
		List<String>result=list.stream().sorted(Comparator.comparing(i->i.length())).toList();
		System.out.println(result);
		
		
		
		
	}

}
