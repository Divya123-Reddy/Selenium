package com.attra.thread;

public class WorkerThread implements Runnable {
	public void run() {
		System.out.println("task is executed");
		
	
		System.out.println("sending sms...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
