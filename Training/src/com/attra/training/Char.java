package com.attra.training;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your grade:");
		char a=sc.next().charAt(0);
		switch(a) {
		case 'A':System.out.println("100 marks");
		break;
		case 'B':System.out.println("50 marks");
		break;
		case 'c':System.out.println("80 marks");
		break;
		default:System.out.println("No one");
		
		
		}
		

	}

}
