package com.multithread.classwork;

class PrintTask extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+"-task proceed by -"+Thread.currentThread().getName());
		}
	}
	
}

public class TaskAssign {

	public static void main(String[] args) {
		System.out.println("main() Sarted ,main thread exicute");
		
		PrintTask t1=new PrintTask();
		t1.start();
		
		PrintTask t2=new PrintTask();
		t2.start();
		
		System.out.println("end() ended");

	}

}
