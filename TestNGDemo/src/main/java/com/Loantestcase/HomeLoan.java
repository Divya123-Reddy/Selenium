package com.Loantestcase;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void WebpageHomeLoan() {
		System.out.println("Webpage HomeLoan Loan");

	}

	@Test(dependsOnMethods = { "ztest" })
	public void Ytest() {
		System.out.println("ztest");
//		public void MobpageHomeLoan() {
		//System.out.println("Mobpage HomeLoan Loan");
	}
@Test
	public void ztest() {
		System.out.println("ytest");
	}

	@Test

	public void ApipageHomeLoan() {
		System.out.println("Apipage HomeLoan Loan");
	}

}
