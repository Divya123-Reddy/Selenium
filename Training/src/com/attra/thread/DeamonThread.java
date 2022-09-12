package com.attra.thread;

public class DeamonThread {
	public static void main(String[] args) {
		
	
	long start=System.currentTimeMillis();
	System.out.println("starting the program");
	PrintTableWithNewThread printtable =new PrintTableWithNewThread(1);
	System.out.println("Thread executing a atsk is "+Thread.currentThread().getName());
	System.out.println("The thread 1 state is -"+printtable.getState());
	System.out.println("The threasd is deamon thread"+printtable.isDaemon());
	
	System.out.println("The main thread is a deamon"+Thread.currentThread().isDaemon());
	printtable.setDaemon(true);
	System.out.println("The thread 1 state is -"+printtable.isDaemon());
	System.out.println("The thread 1 state is -"+Thread.currentThread().isDaemon());
	

}
}