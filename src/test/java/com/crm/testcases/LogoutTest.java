package com.crm.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.Logout;

public class LogoutTest extends TestBase{
	Logout logout;
	@BeforeTest
	public void setUp() {
		logout = new Logout();
	}
	@Test(priority=4)
	public void TestLogout() throws Exception {
		logout.logout();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		logout.logout();
		driver.quit();
	}
}
