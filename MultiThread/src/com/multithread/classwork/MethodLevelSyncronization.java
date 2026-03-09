package com.multithread.classwork;


class Tasks{
	public synchronized void print() {
		for(int i=1;i<=5;i++) {
			System.out.println("Number-"+i+" print by "+Thread.currentThread().getName());
		}
	}
	
	
	
}


class Worker implements Runnable{
	public Tasks task;
	public Worker(Tasks task) {
		this.task=task;
	}
	@Override
	public void run() {
		task.print();
		
		
	}
	
	
}


public class MethodLevelSyncronization {
	public static void main(String[] args) {
		Tasks task=new Tasks();
		Thread t1=new Thread(new Worker(task));
		t1.start();
		Thread t2=new Thread(new Worker(task));
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		
		
	}

}
