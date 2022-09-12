package com.attra.training;

import java.util.Scanner;

public class scannerdo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("enter digits 1 to 10");
			n=sc.nextInt();
			
		}while(n>1||n<=10);
		System.out.println(n +":you entered digits between 1 to 10");
		

	}

}
