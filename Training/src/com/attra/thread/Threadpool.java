package com.attra.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool{
	

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		ExecutorService executor=Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++) {
			WorkerThread worker=new WorkerThread();
			executor.execute(worker);
			
			
			
		}
		executor.shutdown();
		System.out.println("Finished sending SMS"+(System.currentTimeMillis()-startTime));
		
	}

}
