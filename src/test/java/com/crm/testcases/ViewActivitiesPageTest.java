package com.crm.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.ViewActivitiesPage;


public class ViewActivitiesPageTest extends TestBase{
	ViewActivitiesPage viewActivitiesPage;
	
	@BeforeTest
	public void setup() {
		viewActivitiesPage = new ViewActivitiesPage();
	}
	@Test(priority = 5,dependsOnGroups={"prerequisites"})
	public void clickViewActivitiesLinkTest() throws Exception {
		viewActivitiesPage.clickViewActivities();
	}
}
