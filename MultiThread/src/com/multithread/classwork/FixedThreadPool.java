package com.multithread.classwork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkForce implements Callable<String>{
	int taskId;
	public WorkForce(int taskId) {
		this.taskId=taskId;
	}
	@Override
	public String call() throws Exception {
		String name="kodewala academy";
		return name +"task id- "+taskId+"task assigned by "+Thread.currentThread().getName();
	}
	
	
}
public class FixedThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(int i=1;i<=10;i++) {
			Future<String>res=service.submit(new WorkForce(i));
			System.out.println(res.get());
		}
		

	}

}
