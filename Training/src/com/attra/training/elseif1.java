package com.attra.training;

import java.util.Scanner;

public class elseif1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("who you want");
		int x = sc.nextInt();
		if (x == 10) {
			System.out.println("I am 10th persont");

		} else if (x == 11) {
			System.out.println("I am 11th person");
		} else if (x == 12) {
			System.out.println("I am 12th person");
		} else {
			System.out.println("I am not person");
		}

	}

}
