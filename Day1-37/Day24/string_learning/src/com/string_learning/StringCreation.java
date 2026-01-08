package com.string_learning;

public class StringCreation {
	public static void main(String[]args) {
		String str="Btm";
		str.concat(" Bangalore");
		System.out.print(str);//note:-it will print only Btm.not concatination value
		
		String s1="abinash";
		String s2="das";
		String s3=s1+s2;//In heap segement it will automatically create a string-builder,while concatination to append and create object.
	}

}
