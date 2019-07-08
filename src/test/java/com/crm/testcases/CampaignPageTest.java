package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.CampaignPage;
import com.crm.util.TestUtil;

public class CampaignPageTest extends TestBase{
CampaignPage campaignPage;
String sheetName="campaign";

@BeforeClass
public void setup() throws Exception {
	campaignPage = new CampaignPage();
}

@Test(priority=2, dependsOnGroups={"prerequisites"})
public void clickCampaignLinkTest() throws Exception {
	campaignPage.clickOnCampaign();
}

@DataProvider
public Object[][] getCRMTestData() {
	Object[][] data=TestUtil.getTestData("Create Campaign");
	return data;
}

@Test(priority=3, dataProvider="getCRMTestData", dependsOnMethods={"clickCampaignLinkTest"})
public void validateCreateCampaign(String application, String campaignName, String startDate, String endDate, String description) throws Exception {
	Assert.assertTrue(campaignPage.createCampaign(application, campaignName, startDate, endDate, description));
}

@Test(priority=4, dependsOnMethods={"clickCampaignLinkTest"})
public void searchCampaignTest() throws Exception {
	Assert.assertTrue(campaignPage.searchCampaign());
}

}
   