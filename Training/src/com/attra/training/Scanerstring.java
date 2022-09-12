package com.attra.training;

import java.util.Scanner;

public class Scanerstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		String s=sc.nextLine();
		switch(s) {
		case "Hocky":System.out.println("Hocky");
		break;
		case "Football":System.out.println("football");
		break;
		case "badminton":System.out.println("Badminton");
		break;
		default:System.out.println("noo");
			
		}

	}

}
