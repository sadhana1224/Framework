package com.w3schools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.utils.SeWrappers;

public class CertificatePage extends SeWrappers {

@FindBy(xpath="//a[@id='certificates-link']")
WebElement clickCertificate;

@FindBy(xpath="//span[text()='Browse exams']")
WebElement browseexam;

@FindBy(xpath="(//input[@aria-label='Search'])[1]")
WebElement searchcourse;

@FindBy(xpath="(//span[@class='search-flydown--product-title'])[2]")
WebElement choosejava;

	public CertificatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void switchframe()
	{
		frameByIndex(0);
	}
	public void clickCertificateOption()
	{
		click(clickCertificate);
	}
	public void clickBrowseExams()
	{
		click(browseexam);
	}
	public void searchCourseJava(String searchText)
	{
		switchWindows();
		typeText(searchcourse, searchText);
	}
	public void chooseJavaCertification()
	{
		click(choosejava);
	}
}
