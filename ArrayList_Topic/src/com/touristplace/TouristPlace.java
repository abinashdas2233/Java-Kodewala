package com.touristplace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristPlace {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>(20);
		list.add(1);
		list.add(12);
		list.add(14);
		list.add(null);
		list.add(2, 4);
		list.remove(4);
		System.out.println(list);
	
		
		

	}

}
