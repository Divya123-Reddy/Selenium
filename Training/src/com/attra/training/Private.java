package com.attra.training;

class P {
	public int data = 46;

	public void msg() {
		System.out.println("Heelo data");
	}
}
	public class Private{

	public static void main(String args[]) {
		P f = new P();
		System.out.println(f.data);
		f.msg();

	}

}
