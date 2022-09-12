package com.AttraNestedClass;

public class NestedInterfaceExample implements Printer.samsung {
	public static void main(String[] args) {
		System.out.println("program starting");
		
		Printer.samsung obj=new NestedInterfaceExample();
		obj.print();
		
		System.out.println("program completed successfully...");
		
	}
	@Override
	public void print() {
		System.out.println("printing the documents.....");
	}

}
