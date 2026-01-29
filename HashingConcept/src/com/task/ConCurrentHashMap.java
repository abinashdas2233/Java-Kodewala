package com.task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>hm=new ConcurrentHashMap<Integer, String>();
		hm.put(1,"abhi");
		hm.put(2, "Abhi");
		hm.put(3, "human");
		
		for(var i:hm.entrySet()) {
			hm.remove(3);
			System.out.println(i.getValue()+"->"+i.getKey());
		}

	}

}
