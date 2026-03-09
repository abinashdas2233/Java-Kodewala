package com.multithread.classwork;

class WorkerTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is going to wait state");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			System.out.println("Interuptted");
		}
		System.out.println("Completed");
		
	}
	
}

public class SleepDemo {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new WorkerTask());
		t1.start();
		
		t1.interrupt();
	}

}
