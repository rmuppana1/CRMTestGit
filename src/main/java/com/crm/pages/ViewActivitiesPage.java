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
import com.crm.locators.InquiryLocators;
import com.crm.locators.ViewActivitiesLocators;
import com.crm.util.DatePicker;
import com.crm.util.ExcelData;


public class ViewActivitiesPage extends TestBase{
	ViewActivitiesLocators viewActivitiesLocators;
	CampaignLocators campaignLocators;
	InquiryLocators inquiryLocators;
	DatePicker datePicker;

	ExcelData excel = new ExcelData();

	public ViewActivitiesPage() {
		super();
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		datePicker 		 = PageFactory.initElements(driver, DatePicker.class);
		excel.ExcelDataProvider();
	}


	//To click on View Activities
	public void clickViewActivities() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try
		{
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.activityLink));
			action.moveToElement(viewActivitiesLocators.activityLink)
			.moveToElement(viewActivitiesLocators.viewActivitiesLink)
			.click().build().perform(); 
		}catch (Exception e) {
			e.printStackTrace();			
		}
	}

	//To create New Activity
	public void createActivity() throws Exception {

		//excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try {
			String application = excel.getdata("Create Activity", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.application));
			new Select(viewActivitiesLocators.application).selectByVisibleText(application);
			String activityName = excel.getdata("Create Activity", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityName));
			viewActivitiesLocators.activityName.sendKeys(activityName);
			String campaignName = excel.getdata("Create Activity", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.campaignName));
			new Select(viewActivitiesLocators.campaignName).selectByVisibleText(campaignName);
			String activityType = excel.getdata("Create Activity", 1, 3);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityType));
			new Select(viewActivitiesLocators.activityType).selectByVisibleText(activityType);
			String activityStatus = excel.getdata("Create Activity", 1, 4);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityStatus));
			new Select(viewActivitiesLocators.activityStatus).selectByVisibleText(activityStatus);
			String dueDate = excel.getdate("Create Activity", 1, 5);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("document.querySelector('#dueDate').value='"+dueDate+"'");
			String subject = excel.getdata("Create Activity", 1, 6);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.subject));
			viewActivitiesLocators.subject.sendKeys(subject);
			String message = excel.getdata("Create Activity", 1, 7);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.message));
			viewActivitiesLocators.message.sendKeys(message);
			String questionnaire = excel.getdata("Create Activity", 1, 8);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.questionnaire));
			new Select(viewActivitiesLocators.questionnaire).selectByVisibleText(questionnaire);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.createActivity));
			viewActivitiesLocators.createActivity.click();
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}

	//To Search Activity
	public void searchActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		try {
			String searchActivityName = excel.getdata("Search Activity", 1, 0);
			System.out.println(searchActivityName);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.quickSearch));
			campaignLocators.quickSearch.sendKeys(searchActivityName);
			Thread.sleep(3000);
			campaignLocators.quickSearch.sendKeys(Keys.SPACE);
			//driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//To Edit an Activity
	public void editActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		datePicker 		 = PageFactory.initElements(driver, DatePicker.class);
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			String application = excel.getdata("Edit Activity", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.application));
			new Select(viewActivitiesLocators.application).selectByVisibleText(application);
			String activityName = excel.getdata("Edit Activity", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityName));
			viewActivitiesLocators.activityName.clear();
			viewActivitiesLocators.activityName.sendKeys(activityName);
			String campaignName = excel.getdata("Edit Activity", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.campaignName));
			new Select(viewActivitiesLocators.campaignName).selectByVisibleText(campaignName);
			String activityType = excel.getdata("Edit Activity", 1, 3);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityType));
			new Select(viewActivitiesLocators.activityType).selectByVisibleText(activityType);
			String activityStatus = excel.getdata("Edit Activity", 1, 4);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.activityStatus));
			new Select(viewActivitiesLocators.activityStatus).selectByVisibleText(activityStatus);
			String dueDate = excel.getdate("Edit Activity", 1, 5);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("document.querySelector('#dueDate').value='"+dueDate+"'");
			String subject = excel.getdata("Edit Activity", 1, 6);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.subject));
			viewActivitiesLocators.subject.clear();
			viewActivitiesLocators.subject.sendKeys(subject);
			String message = excel.getdata("Edit Activity", 1, 7);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.message));
			viewActivitiesLocators.message.clear();
			viewActivitiesLocators.message.sendKeys(message);
			String questionnaire = excel.getdata("Edit Activity", 1, 8);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.questionnaire));
			new Select(viewActivitiesLocators.questionnaire).selectByVisibleText(questionnaire);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.saveActivity));
			viewActivitiesLocators.saveActivity.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To add Customers to the Activity
	public void addCustomersToActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addCustomerIcon));
			viewActivitiesLocators.addCustomerIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkCustomer0));
			viewActivitiesLocators.checkCustomer0.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkCustomer1));
			viewActivitiesLocators.checkCustomer1.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addCustomerButton));
			viewActivitiesLocators.addCustomerButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To add Leads to the Activity
	public void addLeadsToActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addCustomerIcon));
			viewActivitiesLocators.addCustomerIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.leadsRadioButton));
			viewActivitiesLocators.leadsRadioButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkLead0));
			viewActivitiesLocators.checkLead0.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkLead1));
			viewActivitiesLocators.checkLead1.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addLeadButton));
			viewActivitiesLocators.addLeadButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To add Contacts to the Activity
	public void addContactsToActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addContactsIcon));
			viewActivitiesLocators.addContactsIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkContact0));
			viewActivitiesLocators.checkContact0.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkContact1));
			viewActivitiesLocators.checkContact1.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addContactsButton));
			viewActivitiesLocators.addContactsButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To add Lead Contacts to the Activity
	public void addLeadContactsToActivity() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addContactsIcon));
			viewActivitiesLocators.addContactsIcon.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.leadContactsRadioButton));
			viewActivitiesLocators.leadContactsRadioButton.click();
			try {
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkLeadContact0));
			viewActivitiesLocators.checkLeadContact0.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.checkLeadContact1));
			viewActivitiesLocators.checkLeadContact1.click();
			}
			catch(Exception e)
			{
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addLeadContactsButton));
			viewActivitiesLocators.addLeadContactsButton.click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addLeadContactsButton));
			viewActivitiesLocators.addLeadContactsButton.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To Create Logs for Customer/lead
	public void addLog() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.addLogIcon));
			viewActivitiesLocators.addLogIcon.click();
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

	//To Create reminder for Customer/lead
	public void reminder() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.reminderIcon));
			viewActivitiesLocators.reminderIcon.click();
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.remainderDate));
			String remainderDate = excel.getdate("Reminder_Campaign", 1, 1);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('#remainderDate').value='"+remainderDate+"'");
			String reminderDescription = excel.getdata("Reminder_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.reminderDescription));
			campaignLocators.reminderDescription.sendKeys(reminderDescription);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.saveReminder));
			viewActivitiesLocators.saveReminder.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To fill Questionnaire for Customer/lead
	public void questionnaire() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.questionnaireIcon));
			viewActivitiesLocators.questionnaireIcon.click();
			String answer = excel.getdata("Questionnaire_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.answer));
			campaignLocators.answer.sendKeys(answer);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveQuestionnaire));
			campaignLocators.saveQuestionnaire.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To create an Inquiry for Customer/lead
	public void inquiry() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.customersLink));
			viewActivitiesLocators.customersLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.inquiryIcon));
			viewActivitiesLocators.inquiryIcon.click();
			String inquiryOperation = excel.getdata("Inquiry_Campaign", 1, 14);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryOperation));
			new Select(campaignLocators.inquiryOperation).selectByVisibleText(inquiryOperation);
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
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('#eventStartDate').value='"+eventStartDate+"'");
			String eventEndDate = excel.getdata("Inquiry_Campaign", 1, 5);
			js.executeScript("document.querySelector('#eventEndDate').value='"+eventEndDate+"'");
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
			//String accountExecutive = excel.getdata("Inquiry_Campaign", 1, 7);
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

	//To Create Logs for Customer/lead Contact
	public void addLogContact() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactAddLogIcon));
			viewActivitiesLocators.contactAddLogIcon.click();
			String status = excel.getdata("Add Log_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.status));
			new Select(viewActivitiesLocators.status).selectByVisibleText(status);
			String comments = excel.getdata("Add Log_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(viewActivitiesLocators.comments));
			viewActivitiesLocators.comments.sendKeys(comments);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.createLog));
			viewActivitiesLocators.createLog.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To Create reminder for Customer/lead Contact
	public void reminderContact() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactReminderIcon));
			viewActivitiesLocators.contactReminderIcon.click();
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.remainderDate));
			String remainderDate = excel.getdate("Reminder_Campaign", 1, 1);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('#remainderDate').value='"+remainderDate+"'");
			String reminderDescription = excel.getdata("Reminder_Campaign", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.reminderDescription));
			campaignLocators.reminderDescription.sendKeys(reminderDescription);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.saveReminder));
			viewActivitiesLocators.saveReminder.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To fill Questionnaire for Customer/lead Contact
	public void questionnaireContact() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactQuestionnaireIcon));
			viewActivitiesLocators.contactQuestionnaireIcon.click();
			String answer = excel.getdata("Questionnaire_Campaign", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.answer));
			campaignLocators.answer.sendKeys(answer);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.saveQuestionnaire));
			campaignLocators.saveQuestionnaire.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	//To create an Inquiry for Customer/lead Contact
	public void inquiryContact() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		campaignLocators = PageFactory.initElements(driver, CampaignLocators.class);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.searchedActivityName));
			viewActivitiesLocators.searchedActivityName.click();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactsLink));
			viewActivitiesLocators.contactsLink.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.contactInquiryIcon));
			viewActivitiesLocators.contactInquiryIcon.click();
			String inquiryOperation = excel.getdata("Inquiry_Campaign", 1, 14);
			wait.until(ExpectedConditions.visibilityOf(campaignLocators.inquiryOperation));
			new Select(campaignLocators.inquiryOperation).selectByVisibleText(inquiryOperation);
			wait.until(ExpectedConditions.elementToBeClickable(campaignLocators.inquiryNext));
			campaignLocators.inquiryNext.click();
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
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('#eventStartDate').value='"+eventStartDate+"'");
			String eventEndDate = excel.getdata("Inquiry_Campaign", 1, 5);
			js.executeScript("document.querySelector('#eventEndDate').value='"+eventEndDate+"'");
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
			//String accountExecutive = excel.getdata("Inquiry_Campaign", 1, 7);
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

	//To create Activity Task
	public void createActivityTask() throws Exception {
		excel.ExcelDataProvider();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		viewActivitiesLocators = PageFactory.initElements(driver, ViewActivitiesLocators.class);
		inquiryLocators = PageFactory.initElements(driver, InquiryLocators.class);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.activityTasks));
			viewActivitiesLocators.activityTasks.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.createTask));
			viewActivitiesLocators.createTask.click();
			String assignedTo = excel.getdata("Activity Task", 1, 0);
			wait.until(ExpectedConditions.visibilityOf(inquiryLocators.assignedTo));
			new Select(inquiryLocators.assignedTo).selectByVisibleText(assignedTo);
			String taskName = excel.getdata("Activity Task", 1, 1);
			wait.until(ExpectedConditions.visibilityOf(inquiryLocators.taskName));
			new Select(inquiryLocators.taskName).selectByVisibleText(taskName);
			String description = excel.getdata("Activity Task", 1, 2);
			wait.until(ExpectedConditions.visibilityOf(inquiryLocators.description));
			inquiryLocators.description.sendKeys(description);
			String taskDueDate = excel.getdata("Activity Task", 1, 3);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.querySelector('#taskDueDate').value='"+taskDueDate+"'");
			String taskStatus = excel.getdata("Activity Task", 1, 4);
			wait.until(ExpectedConditions.visibilityOf(inquiryLocators.taskStatus));
			new Select(inquiryLocators.taskStatus).selectByVisibleText(taskStatus);
			wait.until(ExpectedConditions.elementToBeClickable(inquiryLocators.create));
			inquiryLocators.create.click();
			wait.until(ExpectedConditions.elementToBeClickable(viewActivitiesLocators.closeActivityTasks));
			viewActivitiesLocators.closeActivityTasks.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
