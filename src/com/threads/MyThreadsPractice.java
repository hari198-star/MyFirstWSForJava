package com.threads;

import java.util.concurrent.Callable;

public class MyThreadsPractice {

	public static void main(String[] args) {
		MyThreadsPractice mtp = new MyThreadsPractice();
        RunnableThread runnable = mtp.new RunnableThread();
        
        Thread t = new Thread(runnable);
        t.setName("My first runnable thread...");
        
        Thread t1 = mtp.new MyThread();
        t1.setName("Thread extends thread...");
        t.start();
        t1.start();
        
        System.out.println("Main thread name : "+Thread.currentThread().getName());
	}
	
	public class RunnableThread implements Runnable {

		@Override
		public void run() {			
			System.out.println("Printing current threads name : " + Thread.currentThread().getName());			
		}		
	}
	
	public class MyThread extends Thread {
		public void run() {
			System.out.println("Printing current threads name : " + Thread.currentThread().getName());
		}
	}
	
	public class MyCallableThread implements Callable {

		@Override
		public Object call() throws Exception {
			
			return "My name is hari...";
		}
		
	}

}
