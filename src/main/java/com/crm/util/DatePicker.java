package com.crm.util;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.crm.locators.CampaignLocators;
import com.crm.locators.DatePickerLocators;



public class DatePicker 
{
	WebDriver driver;
	CampaignLocators campaignLocators;
	DatePickerLocators datePickerLocators;

	public DatePicker(WebDriver driver){
		this.driver = driver;
	}

	public void datePicker(String Date) throws Exception
	{
		datePickerLocators 		 = PageFactory.initElements(driver, DatePickerLocators.class);
		String datetime = Date;
		String date_dd_MM_yyyy[] = (datetime.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
		datePickerLocators.year.click();

		// To select Year
		if(yearDiff!=0)                     
		{
			if(yearDiff>0)
			{
				for(int i=0;i<yearDiff;i++)
				{
					datePickerLocators.nextYear.click();
				}	

			}
			else if(yearDiff<0)
			{
				for(int i=0;i> (yearDiff);i--)
				{
					datePickerLocators.previousYear.click();
				}
			}
		}

		//To select Month
		List<WebElement> list_AllMonths = datePickerLocators.monthList;
		list_AllMonths.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();

		//To select Date
		List<WebElement> list_AllDates=datePickerLocators.daysList;  
		//comparing the required date with today's date
		for (WebElement cell : list_AllDates)
		{
			if (cell.getText().equals((date_dd_MM_yyyy[1])))
			{
				cell.click();
				break;
			}
		}
	}

}
