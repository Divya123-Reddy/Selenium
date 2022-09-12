package com.attra.thread;

public class Threadsleep {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		System.out.println("starting the program");
		
		try {
			Thread.sleep(3000);
	
		long endTime=System.currentTimeMillis();
		System.out.println("thread Nmae is"+Thread.currentThread().getName());
		System.out.println("thread Nmae is"+Thread.currentThread().getPriority());
		Thread.currentThread().setName("user thread");
		Thread.currentThread().setPriority(10);
		
		System.out.println("thread Nmae is now updated is"+Thread.currentThread().getName());
		System.out.println("thread priority is now changed"+Thread.currentThread().getPriority());
		
		
		
		System.out.println("completed the execution with time of"+(endTime-startTime));
		

		} catch (InterruptedException e) {
			System.err.println("Error while operating with thread");
		e.printStackTrace();
	}
	

}}
