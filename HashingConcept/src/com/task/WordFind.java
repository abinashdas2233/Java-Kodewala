package com.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordFind {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("Abhi","Rahul","Anwesh");
		//Normal
		for(String i:list) {
			if(i.startsWith("A")) {
			System.out.println(i);
			}
		}
		//using stream api
		
	List<String>res=list.stream().filter((i)->i.startsWith("A")).collect(Collectors.toList());
	System.out.println(res);
		
		
	}

}
