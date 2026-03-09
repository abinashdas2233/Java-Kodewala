package com.multithread.classwork;

import java.util.concurrent.locks.ReentrantLock;

class NumberCount{
	ReentrantLock locking=new ReentrantLock();
	int counter=0;
	public void counter() {
		locking.lock();
		
		for(int i=0;i<5;i++) {
			System.out.println("counter value-"+counter+"controled by -"+Thread.currentThread().getName());
			counter++;
		}
		locking.unlock();
	}
}

public class ReantrantLockDemo {

	public static void main(String[] args) {
		NumberCount num=new NumberCount();
		
		Thread t1=new Thread(()->{
			num.counter();
		});
		Thread t2=new Thread(()->{
			num.counter();
		});
		
		t1.start();
		t2.start();
		
		
		
	}

}
