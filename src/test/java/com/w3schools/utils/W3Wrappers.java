package com.w3schools.utils;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.w3schools.pages.BrowserPage;
import com.w3schools.pages.CertificatePage;

import com.w3schools.pages.HomePage;
import com.w3schools.pages.LoginPage;
import com.w3schools.pages.Profilepage;

public class W3Wrappers extends SeWrappers {
	SeWrappers se= new SeWrappers();

	//This class would contain all the reusable methods for W3Schools application
//first testcase
	public void loginW3Schools(String mailid, String pwd)
	{
		try
		{
			LoginPage lpPage= PageFactory.initElements(driver, LoginPage.class);
			HomePage home= PageFactory.initElements(driver, HomePage.class);

			lpPage.setEmail(mailid);
			lpPage.setPassword(pwd);
			lpPage.clickLogin();


			home.waitForLearning();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//second testcase
	public void profilew3schools(String urlName,String addBio,String number,String linkedinprofile,String gitlink)
	{
		try
		{		
			
			Profilepage PrPage= PageFactory.initElements(driver, Profilepage.class);
			PrPage.switchframe();
			PrPage.profileOption();
			
			PrPage.editScroll();
			PrPage.editClick();
			
			PrPage.setUrl(urlName);
			PrPage.saveUrlButton();
			PrPage.setBio(addBio);
			
			PrPage.editPhoneNum();
			PrPage.waitforPhoneNum();
			PrPage.setNum(number);
			PrPage.setLinkedin(linkedinprofile);
			PrPage.setgitHub(gitlink);
			//PrPage.waitforenablePhoneNum();
			//PrPage.enablePhoneNumber();
		/*	
			PrPage.editlinkedin();
			PrPage.waitforLinkedin();
			
			PrPage.setLinkedin(linkedinprofile);
			PrPage.enableLinkedin();
			*/
			PrPage.editContact();
			PrPage.waitForContact();
			PrPage.saveContactButton();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	//third test case
	public void browsew3schools(String searchtext)

	{
		BrowserPage BrPage= PageFactory.initElements(driver, BrowserPage.class);
		BrPage.browseOption();
		BrPage.searchOption(searchtext);
		BrPage.searchTutorial();
		BrPage.pressContinue();
	}
	
	//4th testcase
	public void certificatew3schools(String searchtext)
	{
		CertificatePage CrPage= PageFactory.initElements(driver, CertificatePage.class);
		CrPage.switchframe();
		CrPage.clickCertificateOption();
		CrPage.clickBrowseExams();
		CrPage.searchCourseJava(searchtext);
		CrPage.chooseJavaCertification();
	}
	
	//5th testcase

}
