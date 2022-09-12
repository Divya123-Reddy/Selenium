package com.attra.thread;

public class ThreadByRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("printing from the thread :"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		ThreadByRunnableInterface runnable=new ThreadByRunnableInterface();
		Thread thread=new Thread(runnable,"Runnable");
		thread.start();
		System.out.println("executed by thread:"+Thread.currentThread().getName());
		System.out.println("program end...");
		
		
	}
	

}
