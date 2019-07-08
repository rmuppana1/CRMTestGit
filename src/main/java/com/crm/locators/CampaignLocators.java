package com.crm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CampaignLocators {

	/*WebDriver driver;

	public CampaignLocators(WebDriver driver) {
		this.driver = driver;
	}*/

	/**************************************************************************************************/

	// Create Campaign

	@FindBy(how = How.XPATH, using = "//*[@id='campaignLink']")
	public WebElement campaignLink ;

	/**************************************************************************************************/

	// Create Campaign
	@FindBy(how = How.ID, using = "campaignApplicationId")
	public WebElement application ;

	@FindBy(how = How.ID, using = "name")
	public WebElement campaignName ;

	@FindBy(how = How.ID, using = "startDate")
	public  WebElement startDate ;

	@FindBy(how = How.ID, using = "endDate")
	public WebElement endDate ;

	@FindBy(how = How.ID, using = "description")
	public WebElement description ;

	@FindBy(how = How.XPATH, using = ".//*[@id='campaignGeneralInfo']/div/button[1]")
	public WebElement createCampaign ;

	@FindBy(how = How.XPATH, using = "/html/body/div[23]")
	public WebElement calender ;

	/**************************************************************************************************/

	//Search Campaign
	@FindBy(how = How.ID, using = "search")
	public WebElement quickSearch ;

	/**************************************************************************************************/

	//Edit Campaign
	@FindBy(how = How.XPATH, using = "//*[@id='searchCampaign']/tbody/tr[1]/td[1]/a")
	public WebElement searchedCampaignName ;

	@FindBy(how = How.XPATH, using = "//*[@id='campaignGeneralInfo']/div/button[1]")
	public WebElement saveCampaign ;

	/**************************************************************************************************/

	//Add Customers to Campaign
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	public WebElement customersLink ;

	@FindBy(how = How.XPATH, using = "//*[@id='campaignCustomers']/div[1]/table/thead/tr/th[2]/div/a/i")
	public WebElement addCustomerIcon ;

	@FindBy(how = How.ID, using = "checkid0")
	public WebElement checkCustomer0 ;

	@FindBy(how = How.ID, using = "checkid1")
	public WebElement checkCustomer1 ;

	@FindBy(how = How.XPATH, using = "//*[@id='hideButtons']/div/div[2]/button") 
	public WebElement addCustomerButton ;


	/**************************************************************************************************/

	//Add Leads to Campaign
	@FindBy(how = How.ID, using = "campaignLeadsList")
	public WebElement leadsRadioButton ;

	@FindBy(how = How.ID, using = "checkleadid0")
	public WebElement checkLead0 ;

	@FindBy(how = How.ID, using = "checkleadid1")
	public WebElement checkLead1 ;

	@FindBy(how = How.XPATH, using = "//*[@id='hideLeadButtons']/div/div[2]/button")
	public WebElement addLeadButton ;

	/**************************************************************************************************/

	//Add Log

	@FindBy(how = How.XPATH, using = "//*[@id='campaignCustomers']//tr[1]/td[2]")
	public WebElement addLogIcon ;

	@FindBy(how = How.ID, using = "contactId")
	public WebElement contact ;

	@FindBy(how = How.ID, using = "activityId")
	public WebElement activity ;

	@FindBy(how = How.ID, using = "cusStatusId") //conStatusId
	public WebElement status ;

	@FindBy(how = How.ID, using = "custDescription")//contactDescription
	public WebElement comments ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"campaignAddLog\"]//button[1]")//createLog
	public WebElement createLog ;

	/**************************************************************************************************/

	//Reminder

	@FindBy(how = How.XPATH, using = "//*[@id='campaignCustomers']//tr[1]/td[4]")
	public WebElement reminderIcon ;

	@FindBy(how = How.ID, using = "activityId")
	public WebElement reminderActivity ;

	@FindBy(how = How.ID, using = "remainderDate")
	public WebElement remainderDate ;

	@FindBy(how = How.ID, using = "reminderDescription")
	public WebElement reminderDescription ;

	@FindBy(how = How.XPATH, using = "//*[@id='viewCustRemainderForm']//fieldset/div[4]/button[1]")
	public WebElement saveReminder ;

	/**************************************************************************************************/

	//Questionnaire

	@FindBy(how = How.XPATH, using = "//*[@id='campaignCustomers']//tr[1]/td[5]")
	public WebElement questionnaireIcon ;

	@FindBy(how = How.ID, using = "qutionarieActivityId1")
	public WebElement qutionarieActivity ;

	@FindBy(how = How.ID, using = "questionnairenext")
	public WebElement questionnaireNext ;

	@FindBy(how = How.ID, using = "settingValue1")
	public WebElement answer ;

	@FindBy(how = How.XPATH, using = "//*[@id='saveButton']/button[2]")
	public WebElement saveQuestionnaire ;


	/**************************************************************************************************/

	//Inquiry

	@FindBy(how = How.XPATH, using = "//*[@id='campaignCustomers']//tr[1]/td[6]")
	public WebElement inquiryIcon ;

	@FindBy(how = How.ID, using = "inquiryOperationsId")
	public WebElement inquiryOperation ;
	
	@FindBy(how = How.ID, using = "qutionarieActivityId")
	public WebElement inquiryActivity ;

	@FindBy(how = How.ID, using = "lnext")
	public WebElement inquiryNext ;

	@FindBy(how = How.ID, using = "inquiryCLeadContactId")
	public WebElement inquiryContact ;

	@FindBy(how = How.ID, using = "eventTypeId")
	public WebElement eventType ;

	@FindBy(how = How.ID, using = "inquiryStatusId")
	public WebElement inquiryStatus ;

	@FindBy(how = How.ID, using = "leadGuestCount")
	public WebElement guestCount ;

	@FindBy(how = How.ID, using = "eventStartDate")
	public WebElement eventStartDate ;

	@FindBy(how = How.ID, using = "eventEndDate")
	public WebElement eventEndDate ;

	@FindBy(how = How.ID, using = "inquiryNext1")
	public WebElement inquiryNext1 ;

	@FindBy(how = How.ID, using = "leadPhone")
	public WebElement phone ;

	@FindBy(how = How.ID, using = "inquiryNext2")
	public WebElement inquiryNext2 ;

	@FindBy(how = How.ID, using = "inquiryNext3")
	public WebElement inquiryNext3 ;

	@FindBy(how = How.ID, using = "aeId")
	public WebElement accountExecutive ;

	@FindBy(how = How.ID, using = "proposalStatusId")
	public WebElement proposalStatus ;

	@FindBy(how = How.ID, using = "businessUnitId")
	public WebElement businessUnit ;

	@FindBy(how = How.ID, using = "countyId")
	public WebElement county ;

	@FindBy(how = How.ID, using = "deliveryCharges")
	public WebElement deliveryCharges ;

	@FindBy(how = How.ID, using = "eventName")
	public WebElement eventName ;

	@FindBy(how = How.XPATH, using = "//*[@id='saveButton']/button[1]")
	public WebElement saveInquiry ;

}
