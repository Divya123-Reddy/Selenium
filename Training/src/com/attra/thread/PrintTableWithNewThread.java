package com.attra.thread;

public class PrintTableWithNewThread extends Thread {
	int n=1;
	
	
	public PrintTableWithNewThread(int n) {
		super();
		this.n = n;
	}
	@Override
	public void run() {
		print(n);
	}
	

	public void print(int n) {
		System.out.println("printing the table...");
	
		long startTime =System.currentTimeMillis();
		for(int i=1;i<=12;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i*n);
		}
		System.out.println("Thread executing a task is -"+Thread.currentThread().getName());
		
		System.out.println("Time taken to ccomplete the tasks "+ (System.currentTimeMillis()-startTime));
	}

	
}


