package com.AttraNestedClass;

public class StaticInnerClass {
	
	static int started=5;
	String org="Attra";

	public static void main(String[] args) {
		System.out.println("program started.....");
		InnerClass innerClass=new StaticInnerClass.InnerClass();
		innerClass.printOrgDettails();
		System.out.println("program terminated...");

	}
	
	static class InnerClass{
		void printOrgDettails() {
			System.out.println("The organization was started"+started);
			empDetails();

}
}
	public static void empDetails() {
		System.out.println("printing the employee detail..");
		
	}
	
}