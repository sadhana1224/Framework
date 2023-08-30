package com.w3schools.tests;

import org.testng.annotations.Test;

import com.w3schools.utils.Reports;
import com.w3schools.utils.SeWrappers;
import com.w3schools.utils.W3Wrappers;

public class BrowserTest extends SeWrappers{
	W3Wrappers w3= new W3Wrappers();
	SeWrappers se= new SeWrappers();
	@Test
	public void browseTutorials()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("Valid browseTutorial functionality");
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("sadhu.lokii1924@gmail.com","Automation@19");
			w3.browsew3schools("Learn java");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			Reports.reportStep("FAIL", "Problem broseTutorials page");
		}
	}
	

}
