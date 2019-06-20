package com.threads;

public class ThreadJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThreadJoining tj = new ThreadJoining();
        
        Thread t1 = new Thread(tj.new A());
        Thread t2 = new Thread(tj.new B(t1));
        
        t2.start();
        t1.start();
        
        t2.interrupt();
	}
	
	private class A implements Runnable {
		public void run() {
			for(int i = 0; i < 1000; i++) {
				System.out.print(i + " , ");
			}
		}
	}
	
	private class B implements Runnable {
		Thread t1;
		
		public B(Thread th) {
			this.t1 = th;
		}
		
		public void run() {
			try {
				t1.join();
			}catch(InterruptedException ie) {
				System.out.println("Interrupted exception in thread b");
			}
			System.out.println("\n");
			for(int i = 0; i < 100; i++) {
				System.out.print(i + " , ");
			}			
		}
	}

}
