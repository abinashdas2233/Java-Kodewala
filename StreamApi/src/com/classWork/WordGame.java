package com.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordGame {

	public static void main(String[] args) {
		//group the word by length only if length is more than 4
		
		List<String>list=Arrays.asList("Abinash","gk","july","nikhil","Aswini");
		Map<Integer,List<String>>res=list.stream().filter(i->i.length()>4).collect(Collectors.groupingBy(i->i.length()));
		System.out.println(res);
		
		
		//Find first non-repeat character
		
		String str="swiss";
		
		Character result=str.chars().mapToObj(c->(char)c)
				//ap-1
				.filter(ch->str.lastIndexOf(ch)==str.indexOf(ch)).findFirst().get();
		System.out.println(result);
		
		
		/*collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()==1)
		.limit(1).map(i->i).forEach(i->System.out.println(i.getKey()));*/

	}

}
