package com.attra.thread;

public class Threadjoin {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println("starting the program");
		PrintTableWithNewThread printtable =new PrintTableWithNewThread(1);
		System.out.println("Thread executing a atsk is "+Thread.currentThread().getName());
		
		 printtable.start();
		try {
			System.out.println("");
			
			printtable.join();
		PrintTableWithNewThread printtable1 =new PrintTableWithNewThread(4);
		System.out.println("thread executing a test is "+Thread.currentThread().getName());
		
		
		printtable1.start();
		PrintTableWithNewThread thread3=new PrintTableWithNewThread(3);
		System.out.println("Thread executing a atsk is.."+Thread.currentThread().getName());
		thread3.start();
		
		System.out.println("The thread 2 state is "+printtable1.getState());
		System.out.println("The thread 3 state is "+thread3.getState());
		
	

	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println("program completely with time"+(System.currentTimeMillis()-start));

}
}