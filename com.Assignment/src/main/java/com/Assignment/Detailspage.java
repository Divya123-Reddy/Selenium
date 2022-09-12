package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detailspage {
public WebDriver driver;
	
	public Detailspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement clickaddcart;
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement clickaddtocart;
	@FindBy(className="shopping_cart_link")
	WebElement clickCART;

	
	public Checkoutpage gotoclickaddcart() {
		clickaddcart.click();
		clickaddtocart.click();
		clickCART.click();
		return new Checkoutpage(driver);
	}
	
	
}
	
