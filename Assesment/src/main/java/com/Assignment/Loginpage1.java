package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	public WebDriver driver;
	
	public Loginpage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="user-name")
	WebElement clickusername;
	@FindBy(xpath="//input[@id='password']")
	WebElement enterpassword;
	@FindBy(id="login-button")
	WebElement clickLogin;
	private CharSequence password;
	


public Detailspage gotoclickusername(String username,String password)
{
	clickusername.sendKeys(username);
	enterpassword.sendKeys(password);
	clickLogin.click();
	return new Detailspage(driver);
	
}
}
