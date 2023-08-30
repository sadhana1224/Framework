package com.w3schools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.utils.SeWrappers;

public class BrowserPage extends SeWrappers{
	
	@FindBy(xpath="//button[text()='Browse tutorials']")
	WebElement browse;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement csearch;
	
	@FindBy(xpath="(//div[@aria-label='Learn Java'])[2]")
	WebElement tutorial;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continueOption;
	
	public BrowserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void browseOption()
	{
		click(browse);
	}
	public void searchOption(String searchtext )
	{
		typeText(csearch, searchtext);
	}
	public void searchTutorial()
	{
		click(tutorial);
	}
	public void pressContinue()
	{
		click(continueOption);
	}
}
