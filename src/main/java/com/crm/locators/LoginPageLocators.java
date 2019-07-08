package com.crm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
	@FindBy(how = How.ID, using = "appID")
	public WebElement appID ;

	@FindBy(how = How.ID, using = "userName")
	public WebElement userName ;

	@FindBy(how = How.ID, using = "password")
	public WebElement password ;

	@FindBy(how = How.ID, using = "save")
	public WebElement login ;
}
