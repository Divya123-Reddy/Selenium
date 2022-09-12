package com.attra.training;

public class constructor {

	int x;

	public constructor(int x) {

		this.x = x;
	}

	public static void main(String args[]) {
		constructor s = new constructor(5);
		System.out.println(s.x);

	}

}
