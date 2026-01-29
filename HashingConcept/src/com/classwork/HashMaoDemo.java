package com.classwork;

import java.util.HashMap;

public class HashMaoDemo {

	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<>();
		hm.put("abinash", "das");
		hm.put("nikhil", "jena");
		hm.put("aswin", "majhi");
		hm.put("dep", "mondal");
		hm.put(null, "priti");
		for(var i:hm.entrySet()) {
			System.out.println(i.getKey()+"->"+i.getValue());
		}
		System.out.println(hm.get(null));

	}

}
