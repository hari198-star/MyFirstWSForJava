package com.threads;

public class SleepingThreadInterrupt {

	public static void main(String[] args) throws InterruptedException {
		SleepingThreadInterrupt sti = new SleepingThreadInterrupt();
		Runnable r = sti.new MyRunnable();
		
		Thread t1 = new Thread(r);
		t1.start();
		
		t1.interrupt();
		
		t1.isInterrupted();
	}
	
	public class MyRunnable implements Runnable {
		public void run() {
			try {
				for(int i=0; i < 5; i ++) {
					System.out.println("Printing : "+i);
					if(Thread.interrupted()) {
						throw new InterruptedException();
					}
				}
			}catch(InterruptedException intExp) {
				throw new RuntimeException();
			}
			
			
		}		
	}
}
