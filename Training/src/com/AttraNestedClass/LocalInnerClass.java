package com.AttraNestedClass;

public class LocalInnerClass {

	public static void main(String[] args) {
		System.out.println("program started.."); 
		LocalInnerClass localInnerClass=new LocalInnerClass();
		localInnerClass.display();
		
		

	}
	public void display() {
		System.out.println("Inside the display method of the class");
		class Local{
			void printMessage(){
				System.out.println("printing a message from localinner class...");
				
			}
		}
		Local local=new Local();
		local.printMessage();
	}

}
