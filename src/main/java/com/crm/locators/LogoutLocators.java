package com.crm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutLocators {
	@FindBy(how = How.XPATH, using = "//div[3]//a/span")
	public WebElement superadminLink ;
	
	@FindBy(how = How.XPATH, using = "//div[3]//li[3]/a")
	public WebElement logoutLink ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='logoutModel']//button[1]")
	public WebElement logoutYes ;
}
