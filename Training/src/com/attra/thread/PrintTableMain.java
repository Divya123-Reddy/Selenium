package com.attra.thread;

public class PrintTableMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("starting the program excution..");
		PrintTables printtable = new PrintTables();
		System.out.println("Thread executing a task is"+Thread.currentThread().getName());
		printtable.print(3);
		System.out.println("completed with time off " + (System.currentTimeMillis() - startTime));

	}

}
