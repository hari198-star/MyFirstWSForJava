package com.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsPractice {

	public static void main(String[] args) {
		ExecutorsPractice ep = new ExecutorsPractice();
		
		Runnable r = new MyRunnable();
		
		Executor executor = Executors.newScheduledThreadPool(2);
		
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
		
	}
	
	private static class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("Threads in executor : "+Thread.currentThread().getName());			
		}
		
	}

}
