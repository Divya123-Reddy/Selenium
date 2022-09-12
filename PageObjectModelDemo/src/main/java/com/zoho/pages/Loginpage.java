package com.zoho.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='login_id']")
	WebElement clicklogin;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pssword;
	
	@FindBy(xpath="//button[@id='nextbtn' and @class='btn blue']")
	WebElement submit;
	

	public Appspage gotoclicklogin(String mail, String password) throws InterruptedException {
		clicklogin.sendKeys(mail);
		submit.click();
		Thread.sleep(2000);
		pssword.sendKeys(password);
		submit.click();
		return new Appspage(driver);
}
	
	
	
	
	

	

}