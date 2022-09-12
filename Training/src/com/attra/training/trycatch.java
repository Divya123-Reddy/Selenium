package com.attra.training;

public class trycatch {

	public static void main(String[] args) {
		try {
			int a=5,b=1;
			int c=a/b;
			System.out.println("result "+c);
			System.out.println("result is"+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("cant divisible by 0");
			
			
		}
		
		

	}

}
