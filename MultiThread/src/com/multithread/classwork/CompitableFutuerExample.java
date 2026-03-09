package com.multithread.classwork;

import java.util.concurrent.CompletableFuture;

public class CompitableFutuerExample {
	public static void main(String[] args) {
		CompletableFuture<Integer>task1=CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			return 10;
		});
		CompletableFuture<Integer>task2=CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			return 20;
		});
	   System.out.println(task1.join());
	   System.out.println(task2.join());
	   
	   CompletableFuture<Integer>add=task1.thenCombineAsync(task2, (a,b)->{
		   return a+b;
		   
	   });
	   CompletableFuture<Integer>combine=task1.thenApply((a)->{
		   return a*20;
	   });
	   
	   System.out.println("add to task-"+add.join());
	   System.out.println("combine-"+combine.join());
		
		
		
	}

}
