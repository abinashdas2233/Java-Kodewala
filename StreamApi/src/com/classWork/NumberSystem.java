package com.classWork;

import java.util.Arrays;
import java.util.List;

public class NumberSystem {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().map(i->i*5).filter(i->i>10).forEach(i->System.out.println(i));
	}

}
