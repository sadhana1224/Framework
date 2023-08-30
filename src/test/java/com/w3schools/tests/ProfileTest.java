package com.w3schools.tests;

import org.testng.annotations.Test;

import com.w3schools.utils.Reports;
import com.w3schools.utils.SeWrappers;
import com.w3schools.utils.W3Wrappers;

public class ProfileTest extends SeWrappers{
	W3Wrappers w3= new W3Wrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void profilePage()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("Valid profile functionality ");
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("sadhu.lokii1924@gmail.com","Automation@19");
			w3.profilew3schools("sadhanaw3","learning java in w3sschools","+919876543210","https://www.linkedin.com/in/sadhanav/","https://github.com/sadhana1224");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			Reports.reportStep("FAIL", "Problem profile page");
		}
	}

}