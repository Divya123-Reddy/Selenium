package com.Loantestcase;

import org.testng.annotations.Test;

public class EducationLoan {
	
	@Test(groups= {"Smoke"},enabled=true,timeOut = 4000)
	public void WebpageEducationLoan() {
			System.out.println("Webpage Education Loan");
	
}
		@Test(groups={"Smoke"})
		public void MobpageEducationLoan() {
			System.out.println("Mobpage Education Loan");
		}
		@Test
		public void ApipageEducationLoan() {
			System.out.println("Apipage Education Loan");
		}
		


}


