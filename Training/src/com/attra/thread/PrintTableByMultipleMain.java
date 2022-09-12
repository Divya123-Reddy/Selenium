package com.attra.thread;

public class PrintTableByMultipleMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("starting the program excution..");
		System.out.println("Thread executing a task is"+Thread.currentThread().getName());
		PrintTableWithNewThread printtable =new PrintTableWithNewThread(3);
		
		 printtable.run();
		
		System.out.println("starting the program excution..");
		PrintTableWithNewThread printtable1 =new PrintTableWithNewThread(5);
		printtable1.run();
		
		System.out.println("main thread completed the tasks");
		try {
			 printtable.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();
		System.out.println("completed with time of"+(System.currentTimeMillis()-startTime));

	}

}
