package com.multithread.classwork;

class Even extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even nmb "+i+"print by "+Thread.currentThread().getName());
			}
		}
		
	}
	
}
class Odd extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("odd nmb "+i+"print by "+Thread.currentThread().getName());
			}
		}
		
	}
	
}

public class NumberSystem {

	public static void main(String[] args) {
		
		Even even=new Even();
		even.start();
		
		
		Odd odd=new Odd();
		odd.start();
		
		
		
	}

}
