package com.crm.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ViewActivitiesLocators {
	WebDriver driver;

	public ViewActivitiesLocators(WebDriver driver) {
		this.driver = driver;
	}

	/**************************************************************************************************/
	// Click View Activities
	@FindBy(how = How.XPATH, using = "//*[@id='activities']")
	public WebElement activityLink ;

	@FindBy(how = How.XPATH, using = "//*[@id='activityLink']")
	public WebElement viewActivitiesLink ;

	// Click Activity Log
	@FindBy(how = How.XPATH, using = "//*[@id='activityLogLink']")
	public WebElement activityLogLink ;

	// Click Assign Activity
	@FindBy(how = How.XPATH, using = "//*[@id='assignActivityLink']")
	public WebElement assignActivityLink ;

	/**************************************************************************************************/
	// Create Activity
	@FindBy(how = How.ID, using = "applicationId")
	public WebElement application ;

	@FindBy(how = How.ID, using = "activityName")
	public WebElement activityName ;

	@FindBy(how = How.ID, using = "campaignId")
	public  WebElement campaignName ;

	@FindBy(how = How.ID, using = "activityId")
	public  WebElement activityType ;

	@FindBy(how = How.ID, using = "statusId")
	public WebElement activityStatus ;

	@FindBy(how = How.ID, using = "dueDate")
	public WebElement dueDate ;

	@FindBy(how = How.ID, using = "subject")
	public WebElement subject ;

	@FindBy(how = How.ID, using = "message")
	public WebElement message ;

	@FindBy(how = How.ID, using = "questionnaire")
	public WebElement questionnaire ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityGeneralInfo\"]/div/button[1]")
	public WebElement createActivity ;

	@FindBy(how = How.XPATH, using = "/html/body/div[31]")
	public WebElement calender ;

	/**************************************************************************************************/

	//Edit Activity
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchActivity\"]/tbody/tr[2]/td[2]/a")
	public WebElement searchedActivityName ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityGeneralInfo\"]/div/button[1]")
	public WebElement saveActivity ;

	/**************************************************************************************************/

	//Add Customers to Activity
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	public WebElement customersLink ;

	@FindBy(how = How.XPATH, using = "//*[@id='activityCustomerInfo']/div/table/thead/tr/th[2]/a/i")
	public WebElement addCustomerIcon ;

	@FindBy(how = How.ID, using = "checkactid0")
	public WebElement checkCustomer0 ;

	@FindBy(how = How.ID, using = "checkactid1")
	public WebElement checkCustomer1 ;

	@FindBy(how = How.XPATH, using = "//*[@id='hideButtons']/div/div[2]/button")
	public WebElement addCustomerButton ;


	/**************************************************************************************************/

	//Add Leads to Activity
	@FindBy(how = How.ID, using = "selectLeadsList")
	public WebElement leadsRadioButton ;

	@FindBy(how = How.ID, using = "checkActleadid0")
	public WebElement checkLead0 ;

	@FindBy(how = How.ID, using = "checkActleadid1")
	public WebElement checkLead1 ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"hideLeadButtons\"]/div/div[2]/button")
	public WebElement addLeadButton ;

	/**************************************************************************************************/

	//Add Contacts to Activity
	@FindBy(how = How.LINK_TEXT, using = "Contacts")
	public WebElement contactsLink ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityContactsInfo\"]/div/table/thead/tr/th[2]/a")
	public WebElement addContactsIcon ;

	@FindBy(how = How.ID, using = "checkcontid0")
	public WebElement checkContact0 ;

	@FindBy(how = How.ID, using = "checkcontid1")
	public WebElement checkContact1 ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityContactsButtons\"]/div/div[2]/button")
	public WebElement addContactsButton ;

	/**************************************************************************************************/

	//Add Lead Contacts to Activity
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-6']/input[@id='no']")
	public WebElement leadContactsRadioButton ;

	@FindBy(how = How.ID, using = "checkLeadConId0")
	public WebElement checkLeadContact0 ;

	@FindBy(how = How.ID, using = "checkLeadConId1")
	public WebElement checkLeadContact1 ;

	@FindBy(how = How.XPATH, using = "//*[@id=\"activityLeadContactsButtons\"]/div/div[2]/button")
	public WebElement addLeadContactsButton ;
	
	/**************************************************************************************************/

	//Add Log

	@FindBy(how = How.XPATH, using = "//*[@id='activityCustomerInfo']//tr[1]/td[2]")
	public WebElement addLogIcon ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='activityContactsInfo']//tr[2]/td[2]")
	public WebElement contactAddLogIcon ;
	
	@FindBy(how = How.ID, using = "conStatusId")
	public WebElement status ;
	
	@FindBy(how = How.ID, using = "contactDescription")
	public WebElement comments ;

	@FindBy(how = How.ID, using = "createLog")
	public WebElement createLog ;

	/**************************************************************************************************/
	
	//Reminder

	@FindBy(how = How.XPATH, using = "//*[@id='activityCustomerInfo']//tr[1]/td[4]")
	public WebElement reminderIcon ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='activityContactsInfo']//tr[2]/td[4]")
	public WebElement contactReminderIcon ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='activityCusOrLedRemainderForm']//div[3]/button[1]")
	public WebElement saveReminder ;
	
	/**************************************************************************************************/

	//Questionnaire

	@FindBy(how = How.XPATH, using = "//*[@id='activityCustomerInfo']//tr[1]/td[5]")
	public WebElement questionnaireIcon ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='activityContactsInfo']//tr[2]/td[5]")
	public WebElement contactQuestionnaireIcon ;
	
	/**************************************************************************************************/

	//Inquiry Icons

	@FindBy(how = How.XPATH, using = "//*[@id='activityCustomerInfo']//tr[1]/td[6]")
	public WebElement inquiryIcon ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='activityContactsInfo']//tr[2]/td[6]")
	public WebElement contactInquiryIcon ;
	
	/**************************************************************************************************/

	//Inquiry

	@FindBy(how = How.XPATH, using = "//*[@id='searchActivity']//tr[2]/td[1]")
	public WebElement activityTasks ;
	
	@FindBy(how = How.ID, using = "createtaskbtn")
	public WebElement createTask ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tasksList']//button")
	public WebElement closeActivityTasks ;
}
