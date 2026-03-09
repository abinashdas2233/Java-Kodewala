package com.classWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestNumber {

	public static void main(String[] args) {
		//a-1
		List<Integer>list=Arrays.asList(100,88,56,33,22,44);
		long res=list.stream().max(Comparator.comparingInt(i->i)).get();
		System.out.println(res);
		
		
		//a-2
		List<Integer>dup=list.stream().distinct().collect(Collectors.toList());
		List<Integer>sorted=dup.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted.get(sorted.size()-1));
		
		
		//third highest
		int thirdHighest=sorted.stream().sorted((a,b)->b-a).skip(2).findFirst().get();
		System.out.println("thirdHighest-"+thirdHighest);
		
		//3rd lowest
		int thirdLowest=sorted.stream().skip(2).findFirst().get();
		System.out.println("Third Lowest"+thirdLowest);
		
		
		
		

	}

}
