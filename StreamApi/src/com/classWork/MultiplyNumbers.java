package com.classWork;

import java.util.Arrays;
import java.util.List;

public class MultiplyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(44,55,67,78);
		list.stream().map(i->i*5).forEach(i->System.out.println(i));

	}

}
