package com.comparision;

public class DynamicUpdate {
	public static StringBuilder updateName(StringBuilder sb) {
		sb.append(" das");
		return sb;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("abinash");
		System.out.println(updateName(sb));

	}

}
