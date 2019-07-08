package com.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.TestBase;
import com.crm.locators.CampaignLocators;
import com.crm.util.DatePicker;
import com.crm.util.ExcelData;


public class CampaignPage extends TestBase {

	CampaignLocators campaignLocators;
	DatePicker datePicker;
	public boolean test;

	ExcelData excel = new ExcelData();

	public CampaignPage() {
		//super();
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		datePicker = PageFactory.initElements(driver, DatePicker.class);
		excel.ExcelDataProvider();
	}

	// To click on Campaign
	public void clickOnCampaign() throws Exception {
		try {
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.visibilityOf(campaignLocators.campaignLink));
		Actions action = new Actions(driver);
		action.moveToElement(campaignLocators.campaignLink).click().build().perform();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// To Create New Campaign
	public boolean createCampaign(String application, String campaignName, String startDate, String endDate, String description) throws Exception {

		//excel.ExcelDataProvider();
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		// datePicker = PageFactory.initElements(driver, DatePicker.class);
		try {
			
			//String application = excel.getdata("Create Campaign", 1, 0);
			//wait.until(ExpectedConditions.visibilityOf(campaignLocators.application));
			new Select(campaignLocators.application).selectByVisibleText(application);
			//String campaignName = excel.getdata("Create Campaign", 1, 1);
			//wait.until(ExpectedConditions.visibilityOf(campaignLocators.campaignName));
			campaignLocators.campaignName.sendKeys(campaignName);
			//String startDate = excel.getdate("Create Campaign", 1, 2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('#startDate').value='" + startDate + "'");
			//String endDate = excel.getdate("Create Campaign", 1, 3);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.querySelector('#endDate').value='" + endDate + "'");
			//String description = excel.getdata("Create Campaign", 1, 4);
			//wait.until(ExpectedConditions.visibilityOf(campaignLocators.description));
			campaignLocators.description.sendKeys(description);
			//wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.createCampaign));
			campaignLocators.createCampaign.click();
			test=true;
			} catch (Exception e) {
			e.printStackTrace();
			test = false;
		}
		return test;
	}

	// To Search Campaign
	public boolean searchCampaign() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			String searchCampaignName = excel.getdata("Search Campaign", 1, 0);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.quickSearch));
			campaignLocators.quickSearch.sendKeys(searchCampaignName);
			Thread.sleep(2000);
			campaignLocators.quickSearch.sendKeys(Keys.SPACE);
			test=true;
		} catch (Exception e) {
			e.printStackTrace();
			test = false;
		}
		return test;
	}

	// To Edit Campaign
	public void editCampaign() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		// datePicker = PageFactory.initElements(driver, DatePicker.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			String application = excel.getdata("Edit Campaign", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.application));
			new Select(campaignLocators.application).selectByVisibleText(application);
			String campaignName = excel.getdata("Edit Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.campaignName));
			campaignLocators.campaignName.clear();
			campaignLocators.campaignName.sendKeys(campaignName);
			String startDate = excel.getdate("Edit Campaign", 1, 2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('#startDate').value='" + startDate + "'");
			String endDate = excel.getdate("Edit Campaign", 1, 3);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.querySelector('#endDate').value='" + endDate + "'");
			String description = excel.getdata("Edit Campaign", 1, 4);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.description));
			campaignLocators.description.clear();
			campaignLocators.description.sendKeys(description);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveCampaign));
			campaignLocators.saveCampaign.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To add Customers to the Campaign
	public void addCustomersToCampaign() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.addCustomerIcon));
			campaignLocators.addCustomerIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.checkCustomer0));
			campaignLocators.checkCustomer0.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.checkCustomer1));
			campaignLocators.checkCustomer1.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.addCustomerButton));
			campaignLocators.addCustomerButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To add Leads to the Campaign
	public void addLeadsToCampaign() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.addCustomerIcon));
			campaignLocators.addCustomerIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.leadsRadioButton));
			campaignLocators.leadsRadioButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.checkLead0));
			campaignLocators.checkLead0.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.checkLead1));
			campaignLocators.checkLead1.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.addLeadButton));
			campaignLocators.addLeadButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To Create Logs for Customer/lead
	public void addLog() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.addLogIcon));
			campaignLocators.addLogIcon.click();
			String activity = excel.getdata("Add Log_Campaign", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.activity));
			new Select(campaignLocators.activity).selectByVisibleText(activity);
			String status = excel.getdata("Add Log_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.status));
			new Select(campaignLocators.status).selectByVisibleText(status);
			String comments = excel.getdata("Add Log_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.comments));
			campaignLocators.comments.sendKeys(comments);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.createLog));
			campaignLocators.createLog.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To Create reminder for Customer/lead
	public void reminder() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.reminderIcon));
			campaignLocators.reminderIcon.click();
			String reminderActivity = excel.getdata("Reminder_Campaign", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.reminderActivity));
			new Select(campaignLocators.reminderActivity).selectByVisibleText(reminderActivity);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.remainderDate));
			String remainderDate = excel.getdate("Reminder_Campaign", 1, 1);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('#remainderDate').value='" + remainderDate + "'");
			String reminderDescription = excel.getdata("Reminder_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.reminderDescription));
			campaignLocators.reminderDescription.sendKeys(reminderDescription);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveReminder));
			campaignLocators.saveReminder.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To fill Questionnaire
	public void questionnaire() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.questionnaireIcon));
			campaignLocators.questionnaireIcon.click();
			String qutionarieActivity = excel.getdata("Questionnaire_Campaign", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.qutionarieActivity));
			new Select(campaignLocators.qutionarieActivity).selectByVisibleText(qutionarieActivity);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.questionnaireNext));
			campaignLocators.questionnaireNext.click();
			String answer = excel.getdata("Questionnaire_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.answer));
			campaignLocators.answer.sendKeys(answer);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveQuestionnaire));
			campaignLocators.saveQuestionnaire.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// To create an Inquiry
	public void inquiry() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.searchedCampaignName));
			campaignLocators.searchedCampaignName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.customersLink));
			campaignLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryIcon));
			campaignLocators.inquiryIcon.click();
			String inquiryOperation = excel.getdata("Inquiry_Campaign", 1, 14);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryOperation));
			new Select(campaignLocators.inquiryOperation).selectByVisibleText(inquiryOperation);
			String inquiryActivity = excel.getdata("Inquiry_Campaign", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryActivity));
			new Select(campaignLocators.inquiryActivity).selectByVisibleText(inquiryActivity);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryNext));
			campaignLocators.inquiryNext.click();
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryContact));
			new Select(campaignLocators.inquiryContact).selectByIndex(1);
			String eventType = excel.getdata("Inquiry_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.eventType));
			new Select(campaignLocators.eventType).selectByVisibleText(eventType);
			String inquiryStatus = excel.getdata("Inquiry_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryStatus));
			new Select(campaignLocators.inquiryStatus).selectByVisibleText(inquiryStatus);
			String guestCount = excel.getdata("Inquiry_Campaign", 1, 3);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.guestCount));
			campaignLocators.guestCount.sendKeys(guestCount);
			String eventStartDate = excel.getdata("Inquiry_Campaign", 1, 4);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('#eventStartDate').value='" + eventStartDate + "'");
			String eventEndDate = excel.getdata("Inquiry_Campaign", 1, 5);
			js.executeScript("document.querySelector('#eventEndDate').value='" + eventEndDate + "'");
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryNext1));
			campaignLocators.inquiryNext1.click();
			String phone = excel.getdata("Inquiry_Campaign", 1, 6);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.phone));
			campaignLocators.phone.clear();
			campaignLocators.phone.sendKeys(phone);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryNext2));
			campaignLocators.inquiryNext2.click();
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryNext3));
			campaignLocators.inquiryNext3.click();
			// String accountExecutive = excel.getdata("Inquiry_Campaign", 1, 7);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.accountExecutive));
			new Select(campaignLocators.accountExecutive).selectByIndex(1);
			String proposalStatus = excel.getdata("Inquiry_Campaign", 1, 8);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.proposalStatus));
			new Select(campaignLocators.proposalStatus).selectByVisibleText(proposalStatus);
			String businessUnit = excel.getdata("Inquiry_Campaign", 1, 9);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.businessUnit));
			new Select(campaignLocators.businessUnit).selectByVisibleText(businessUnit);
			String county = excel.getdata("Inquiry_Campaign", 1, 10);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.county));
			new Select(campaignLocators.county).selectByVisibleText(county);
			String deliveryCharges = excel.getdata("Inquiry_Campaign", 1, 11);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.deliveryCharges));
			campaignLocators.deliveryCharges.sendKeys(deliveryCharges);
			String eventName = excel.getdata("Inquiry_Campaign", 1, 12);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.eventName));
			campaignLocators.eventName.sendKeys(eventName);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveInquiry));
			campaignLocators.saveInquiry.click();
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
