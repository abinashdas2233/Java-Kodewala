package com.learn.object;

public class InitBlocks {
	//Demonstrating multiple sib & iib
	
	//static Initblock
	static {
		System.out.println("hello from static block 1");
	}
	static {
		System.out.println("hello from static block 2");
	}
	//IIB
	{
		System.out.println("Inside iib -1");
	}
	{
		System.out.println("Inside iib -1");
	}
	//constructor
	InitBlocks(){
		System.out.println("Inside constructor");
	}
	public static void main(String[]args) {
		System.out.println("Inside main()");
		InitBlocks initblock=new InitBlocks();
	}

}
