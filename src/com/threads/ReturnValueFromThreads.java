package com.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ReturnValueFromThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ReturnValueFromThreads rvft = new ReturnValueFromThreads();
		rvft.testCallableThreads();
	}
	
	private void testCallableThreads() throws InterruptedException, ExecutionException {
		Callable<Integer> callObj = new GenerateRandom();
		
		FutureTask<Integer>[] tasks = new FutureTask[5];
		
		for(int i = 0; i < tasks.length; i++) {
			tasks[i] = new FutureTask<Integer>(callObj);
			
			Thread t = new Thread(tasks[i]);
			t.start();
		}
		
		for(int i=0; i < tasks.length; i++) {
			System.out.println(tasks[i].get());
		}
 	}
	
	public class GenerateRandom implements Callable<Integer> {

		@Override
		public Integer call() throws InterruptedException  {
			Random r = new Random();			
			Integer i = r.nextInt();
			Thread.sleep(5000);
			return i;
		}
		
	}

}
