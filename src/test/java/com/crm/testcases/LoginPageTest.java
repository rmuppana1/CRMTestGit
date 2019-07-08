package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;
import com.crm.pages.Logout;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	Logout logout;
	
	@BeforeTest
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
		logout = new Logout();
	}
	
	@Test(priority=1, groups={"prerequisites" })
	public void testLogin() throws Exception {
		Assert.assertTrue(loginPage.validateLogin(prop.getProperty("appid"), prop.getProperty("username"), prop.getProperty("password")));
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		logout.logout();
		driver.quit();
	}
}
