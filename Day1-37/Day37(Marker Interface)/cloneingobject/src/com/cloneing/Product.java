package com.cloneing;

public class Product implements Cloneable{
	int id;
	String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
