package com.Loantestcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Im fist from the last suite");

	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("Im the first on to execute before suits");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before methhod");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@BeforeTest

	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@Test
	public void Webpage() {
		System.out.println("Webpage Car Loan");

	}

	@Test
	public void Mobpage() {
		System.out.println("Mobpage Car Loan");
	}

	@Test
	public void Apipage() {
		System.out.println("Apipage Car Loan");
	}

}
