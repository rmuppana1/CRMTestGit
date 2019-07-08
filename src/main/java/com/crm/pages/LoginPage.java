package com.crm.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.LoginPageLocators;

public class LoginPage extends TestBase {
	public boolean test;
	LoginPageLocators loginPageLocators;

	// Initializing the Page Objects
	public LoginPage() {
		loginPageLocators = PageFactory.initElements(driver, LoginPageLocators.class);
	}

	public boolean validateLogin(String appId, String un, String pass) throws Exception {

		try {
			loginPageLocators.appID.sendKeys(appId);
			loginPageLocators.userName.sendKeys(un);
			loginPageLocators.password.sendKeys(pass);
			loginPageLocators.login.click();
			if (driver.getTitle().equalsIgnoreCase("CRM - Analytics")) {
				test = true;
			} else {
				test = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			test = false;
		}
		return test;
	}
}
