package com.task;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDrives {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList();
		list.add("mumbai");
		list.add("delhi");
		list.add("bbsr");
		list.add("pune");
		Iterator<String>itr=list.iterator();
		
		while(itr.hasNext()) {
			String element=(String)itr.next();
			System.out.println(element);
			list.add("bommanhali");
		}
		

	}

}
