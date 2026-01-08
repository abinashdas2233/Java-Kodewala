package com.string_learning;

public class InternInString {

	public static void main(String[] args) {
		String s1="Academy";
		String s2=new String("Academy");
		
		System.out.print(s1==s2);//it will return false due to difffrent memory location
		s2=s2.intern();//interning .copy the object from heap to scp.
		System.out.print(s1==s2);//now it will return true,because s2 is pointing scp same memory location.

	}

}
