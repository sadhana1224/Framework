package com.w3schools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.utils.SeWrappers;

public class Profilepage  extends SeWrappers{

	
		// TODO Auto-generated method stub
		@FindBy(xpath="//a[@id='profile-link']")
		 WebElement profile;
		
		@FindBy(xpath="//span[text()='Edit']")
		WebElement edit;
		
		@FindBy(xpath="//div[@class='Nick_input_wrapper__SHE-H']/div/div/div/div/input")
		WebElement urlName;
		
		@FindBy(xpath="(//div[starts-with(@class,'Button_wrapper__')])[2]")
		WebElement saveUrl;
		
		@FindBy(xpath="//textarea[@autocapitalize='sentences']")
		WebElement addBio;
		
		@FindBy(xpath="//input[@placeholder='(+) number']")
		WebElement phoneNum;
		
	/*	@FindBy(xpath="(//input[@class='Toggle_check_input__KsoSC'])[3]")
		WebElement enablePhonenum;
		*/
		
		@FindBy(xpath="(//input[@placeholder='Username'])[1]")
		WebElement linkedin;
		
		@FindBy(xpath="(//input[@placeholder='Username'])[3]")
		WebElement github;
		
	 @FindBy(xpath="(//div[starts-with(@class,'Button_wrapper__')])[3]")
		WebElement saveContent;
		

	    public Profilepage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
		
		public void switchframe()
		{
			frameByIndex(0);
		}
		public void profileOption()
		{

			click(profile);
		}
		public void waitForedit()
		{
			waitForMe(edit,20);
		}

		public void editScroll()
		{
			scrollintoView(edit);
		}
		public void editClick()
		{
			jsClick(edit);
		}
		
		public void setUrl(String urltext)
		{
			typeText(urlName,urltext);
		}
		public void saveUrlButton()
		{
			jsClick(saveUrl);
		}
		public void waitForBio()
		{
			waitForMe(addBio,20);
		}
		public void setBio(String textbio)
		{
			typeText(addBio,textbio);
		}
		//phone num
		public void editPhoneNum()
		{
			scrollintoView(phoneNum);
		}
		public void waitforPhoneNum()
		{
			waitForMe(phoneNum,20);
		}
		public void setNum(String number)
		{
			typeText(phoneNum,number);
		}
		public void setLinkedin(String linkedinprofile)
		{
			typeText(linkedin, linkedinprofile);
		}
		public void setgitHub(String gitlink)
		{
			typeText(github, gitlink);
		}
		//enable phoneNum
		/*public void waitforenablePhoneNum()
		{
			waitForMe(phoneNum,20);
		}
		
		public void enablePhoneNumber()
		{
			jsClick(enablePhonenum);
			verifyEnabled(enablePhonenum);
		}
		
		
		//linked in
		public void editlinkedin()
		{
			scrollintoView(linkedin);
		}
		public void waitforLinkedin()
		{
			waitForMe(linkedin,20);
		}
	
		public void setLinkedin(String linkedinprofile)
		{
			typeText(linkedin, linkedinprofile);
		}
		public void enableLinkedin()
		{
			jsClick(linkedin);
		}
			*/
	//save	
		public void editContact()
		{
			scrollintoView(saveContent);
		}
		public void waitForContact()
		{
			waitForMe(saveContent,20);
		}

		public void saveContactButton()
		{
		jsClick(saveContent);
		}
	
	}


