package com.multithread.classwork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Employee implements Callable<Integer>{
	int id;
	public Employee(int id) {
		this.id=id;
	}

	@Override
	public Integer call() throws Exception {
		
		return id;
	}
	
}
public class TaskExecute {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(int i=1;i<10;i++) {
			Future<Integer>res=service.submit(new Employee(i));
			System.out.println(res.get());
			
		}
		

	}

}
