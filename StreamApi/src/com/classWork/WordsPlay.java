package com.classWork;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class WordsPlay {

	public static void main(String[] args) {
		List<String>words=Arrays.asList("java","upi","api","hello","user");
		Map<Integer,List<String>>res=words.stream().collect(Collectors.groupingBy(i->i.length()));
		System.out.println(res);
	}

}
