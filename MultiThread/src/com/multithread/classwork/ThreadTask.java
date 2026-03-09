package com.multithread.classwork;

class Task implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Task assigned.");
		
	}
	
}

public class ThreadTask {
	public static void main(String[] args) {
		Thread t1=new Thread(new Task());
		t1.start();
		t1.start();//Here 2 times start() called,so it will throw Illegal Thread state exception.
	}

}
