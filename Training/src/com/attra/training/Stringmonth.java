package com.attra.training;

import java.util.Scanner;

public class Stringmonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int c = sc.nextInt();
		String monthname ="";
		switch (c) {
		case 1:
			monthname = "1-january";
			break;
		case 2:
			monthname = "2-feby";
			break;
		case 3:
			monthname = "3-march";
			break;
		default:
			System.out.println("invalid month");
			break;

		}
		System.out.println(monthname);

	}

}
