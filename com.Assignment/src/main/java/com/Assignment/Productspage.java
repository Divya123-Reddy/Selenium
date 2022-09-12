package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspage {
public WebDriver driver;
	
	public Productspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="first-name")
	WebElement clickcheckout;
	@FindBy(id="last-name")
	WebElement enterltname;
	@FindBy(id="postal-code")
	WebElement enterptcode;
	@FindBy(id="continue")
	WebElement clickcontinue;
	
	
public Signuppage gotoclickcheckoutpage(String firstname, String lastname,String zipcode )
{
	clickcheckout.sendKeys(firstname);
	enterltname.sendKeys(lastname);
	enterptcode.sendKeys(zipcode);
	clickcontinue.click();
	return new Signuppage(driver);
}

}
