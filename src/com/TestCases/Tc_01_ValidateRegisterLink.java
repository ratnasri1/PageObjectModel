package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericMethods.GenericMethods;

import comApplication_Pages.HomePage;
import comApplication_Pages.RecruiterRegPage;

public class Tc_01_ValidateRegisterLink extends GenericMethods{
	
	@Test
	
	public static void validate_RegisterLink() 
	{boolean status=true;
		//String url="https://www.talentzing.com";
		status=	launchBrowser("chrome","https://www.talentzing.com");
		
		
//==============================================================================		
		/*
		 * Method Name 		: clickRegisterLink
		 * Purpose			: to click on register
		 * Input Parameters	: CSS selector
		 * Return Type		: boolean
		 * Dependency		: open the webpage and click on registerlink
		 * Date of Creation	: 22/11/2018
		 * Created By		: RatnaSri
		 * Reviewed By		:
		 * Modified Date	:
		 */
//=====================================================================
		// verify the browser launch and proceed to click on register link
			
		
if(status)
{
	HomePage homepage=PageFactory.initElements(driver, HomePage.class);
	homepage.clickRegisterLink();
	
//===========================================================================	
	/*
	 * Method Name 		: navigatetoRecruiter
	 * Purpose			: Navigate to Recruiter page
	 * Input Parameters	: CSS selector
	 * Return Type		: Boolean
	 * Dependency		: After Register link click navigate to recruiter link.
	 * Date of Creation	: 11/22/2018
	 * Created By		: RatnaSri
	 * Reviewed By		:
	 * Modified Date	:
	 */
//==============================================================================	
	//verify register page is navigate to recruiter page
	
if(status)	
{
	RecruiterRegPage Recpage=PageFactory.initElements(driver, RecruiterRegPage.class);		
	Recpage.navigatetoRecruiter();
	}
	
	
}
	
	}
	

}
