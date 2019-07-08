package com.crm.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;
import com.crm.locators.LogoutLocators;

public class Logout extends TestBase{
	LogoutLocators logoutLocators;
	//Initializing the Page Objects
	public Logout() {
		super();
		logoutLocators = PageFactory.initElements(driver, 	LogoutLocators.class);
	}
	public void logout() throws Exception {
		
		try {
			Thread.sleep(5000);
			logoutLocators.superadminLink.click();
			logoutLocators.logoutLink.click();
			logoutLocators.logoutYes.click();
			} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
