package com.multithread.classwork;


public class BlockSync {
	
	public static void generateTask() {
		System.out.println("outside syncronized block-"+Thread.currentThread().getName());
		
		synchronized (BlockSync.class) {
			for(int i=1;i<=10;i++) {
				System.out.println("inside syncronized block-"+Thread.currentThread().getName());
			}
			
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Object lock=new Object();
		Thread t1=new Thread(()->{
			generateTask();
		});
		
		Thread t2=new Thread(()->{
			
			generateTask();
		});
		
		
		t1.setName("Thread-1");
		t2.setName("Thred-2");
		
		t1.start();
		t2.start();

	}

}
