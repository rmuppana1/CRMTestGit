package com.crm.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerLocators {
	WebDriver driver;

	public DatePickerLocators(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[31]/div[1]/table/thead/tr[2]/th[2]")
	public WebElement year ;

	@FindBy(how = How.XPATH, using = "/html/body/div[31]/div[2]/table/thead/tr[2]/th[3]")
	public WebElement nextYear ;

	@FindBy(how = How.XPATH, using = "/html/body/div[31]/div[2]/table/thead/tr[2]/th[1]")
	public WebElement previousYear ;

	@FindBy(how = How.XPATH, using = "/html/body/div[31]/div[2]/table/tbody/tr/td/span")
	public List<WebElement> monthList ;

	@FindBy(how = How.XPATH, using = "/html/body/div[31]/div[1]/table/tbody/tr/td")
	public List<WebElement> daysList ;
}
