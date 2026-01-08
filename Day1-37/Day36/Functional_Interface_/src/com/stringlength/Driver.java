package com.stringlength;

public class Driver {

	public static void main(String[] args) {
		IStringLength sl=(a,b)->{
			return a.length()+b.length();
		};
		int res=sl.lengthCheck("abhi", "das");
		System.out.println(res);

	}

}
