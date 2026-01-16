package com.linkedList.classwork;

import java.util.LinkedList;

public class LinkedlistDemonstration {
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		 
		
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		System.out.println("after inserting new element at index 1");
		list.add(2,46);
		for(Integer a: list) {
			System.out.println(a);
		}
	}

}
