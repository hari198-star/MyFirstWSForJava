package com.threads;

public class ThreadsInterferencePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsInterferencePractice tip = new ThreadsInterferencePractice();
		Counter c = new Counter();
		
		Thread threadA = new Thread(tip.new MyRunnableA(c));
		Thread threadB = new Thread(tip.new MyRunnableB(c));
		
		threadA.start();
		threadB.start();		

	}
	
	private static class Counter {
		int count;
		
		public static synchronized void checkStaticLocks() {
			System.out.println("Second thread accessing...");
		}
		
		public synchronized void increment() {
			count++;
			System.out.println("First thread sleeping..");
			try {
				Thread.sleep(10000);
			}catch(InterruptedException ie) {
				
			}
			
		}
		
		public void decrement() {
			count--;
		}
		
		public int getCount() {
			return count;
		}
	}
	
	private class MyRunnableA implements Runnable {

		private Counter counter;
		
		public MyRunnableA(Counter c) {
			this.counter = c;
		}
		
		@Override
		public void run() {
			counter.increment();
			System.out.println("Thread A - " + counter.getCount());
			
		}		
	}
	
	private class MyRunnableB implements Runnable {

		private Counter counter;
		
		public MyRunnableB(Counter c) {
			this.counter = c;
		}
		
		@Override
		public void run() {
			Counter.checkStaticLocks();			
		}
		
	}

}
