package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("bengaluru","pune","delhi");
		String res=list.stream().sorted((a,b)->b.length()-a.length()).findFirst().get();
		System.out.println(res);
		
		List<String >result=list.stream().sorted(Comparator.comparing(i->i.toString()).reversed()).toList();
		System.out.println(result);
		
	}

}
