package com.crm.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InquiryLocators {
	// Click Inquiries link

	@FindBy(how = How.XPATH, using = "//*[@id='inquiries']/a") ////*[@id='inquiry']/a")
	public WebElement inquiriesLink ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='inquiries']/ul/li[1]/a") ////*[@id='inquiries']/a
	public WebElement inquiryLink ;

	/**************************************************************************************************/

	// Filter an Inquiries

	@FindBy(how = How.XPATH, using = "//*[@id='inquiriesForm']//fieldset//button")
	public WebElement Go ;

	/**************************************************************************************************/

	// Create Inquiry Task

	@FindBy(how = How.XPATH, using = "//*[@id='inquiriesList']//tr[1]/td[2]")
	public WebElement inquiryTaskIcon ;

	@FindBy(how = How.ID, using = "createtaskbtn")
	public WebElement createTask ;

	@FindBy(how = How.ID, using = "assigned")
	public WebElement assignedTo ;

	@FindBy(how = How.ID, using = "taskNameId")
	public WebElement taskName ;

	@FindBy(how = How.ID, using = "description1")
	public WebElement description ;

	@FindBy(how = How.ID, using = "taskDueDate")
	public WebElement taskDueDate ;

	@FindBy(how = How.ID, using = "taskStatus")
	public WebElement taskStatus ;

	@FindBy(how = How.ID, using = "taskBtn")
	public WebElement create ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='tasksList']//button")
	public WebElement inquiryTaskClose ;

	/**************************************************************************************************/

	// Create Event from an Inquiry

	@FindBy(how = How.XPATH, using = "//*[@id='inquiriesList']//td[4]")
	public WebElement editInquiry ;

	@FindBy(how = How.ID, using = "inquiryNext1")
	public WebElement inquiryNext1 ;

	@FindBy(how = How.ID, using = "inquiryNext2")
	public WebElement inquiryNext2 ;

	@FindBy(how = How.ID, using = "inquiryNext3")
	public WebElement inquiryNext3 ;

	@FindBy(how = How.ID, using = "aeId")
	public WebElement accountExecutive ;

	@FindBy(how = How.ID, using = "proposalStatusId")
	public WebElement proposalStatus ;

	@FindBy(how = How.ID, using = "businessUnitId")
	public WebElement businessUnit;

	@FindBy(how = How.ID, using = "countyId")
	public WebElement county;

	@FindBy(how = How.ID, using = "deliveryCharges")
	public WebElement deliveryCharges;

	@FindBy(how = How.ID, using = "eventName")
	public WebElement eventName;

	@FindBy(how = How.XPATH, using = "//*[@id='saveButton']/button[2]")
	public WebElement createEvent ;
}
