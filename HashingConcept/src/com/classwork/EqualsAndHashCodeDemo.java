package com.classwork;

class Product{
	String productName;

	public Product(String productName) {
		super();
		this.productName = productName;
	}
}

public class EqualsAndHashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product("apple");
		System.out.println(p1.hashCode());
		Product p2=new Product("maggie");
		System.out.println(p2.hashCode());

	}

}
