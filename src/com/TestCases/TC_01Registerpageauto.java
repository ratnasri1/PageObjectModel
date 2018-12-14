package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.GenericMethods.GenericMethods;


import comApplication_Pages1.Registerpage_details;
import comApplication_Pages1.SiginingPageopen;
import comApplication_Pages1.createAccount;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TC_01Registerpageauto extends GenericMethods{

public static boolean stepstatus=true;
	
	@Given("^Launch \"([^\"]*)\" Browser and load Url$")
	public static void launchBrowser(String browser, DataTable data)
	{
		List<List<String>> url= data.raw();
		String URL= url.get(0).get(0);
		boolean stepstatus = GenericMethods.launchBrowser(browser, URL);
		
		
		}

	
	//===========================================================================
	/*@When("the page is launch check signin option and click and verify the create account header")
	public static void signinoption()
	{
		//mouseover to signin option and display Create account page text
	WebElement ele=	driver.findElement(By.xpath("//div[@class='container']/div/nav/div[@class='header_user_info']"));
	stepstatus= GenericMethods.hoverAndClick(ele);
		if(stepstatus)
		{
		//display create account text
		WebElement pagetext = driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-6']/form/h3"));
		boolean status = pagetext.isDisplayed();
		if(status==true)
		{
			System.out.println("create account is displayed");
			
		}else
		{
			System.out.println("create account is not displayed");*/
		
	@When("the page is launch check signin option and click and verify the create account header")
	public static void signing()
	{
	boolean status;
	if(status = true)
	{
		SiginingPageopen SiginingPage=PageFactory.initElements(driver, SiginingPageopen.class);
		SiginingPageopen.clicksigningLink();
		SiginingPageopen.accountPageDispaly();
	}
}
	
	//================================================================================
	@Then("enter the valid email address in create account page and "
			+ "click on create account button to navigate to register page")
		/*public static void entervalidemail(DataTable data)
		{
		List<List<String>> emailid = data.raw();
		//enter valid email id
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(emailid.get(0).get(0));
		if(stepstatus=true)
		{
			System.out.println("emailid entered");
			
		}else
		{
			System.out.println("emailid not entered");*/
	public static void entervalidemail(DataTable email)
	{
	boolean status;
	if(status = true)
	{
		createAccount CreatAcc =PageFactory.initElements(driver, createAccount.class);
		createAccount.enterEmailid(email);
		createAccount.clickbutton();
		createAccount.RegisterPageDispaly( );
		}
	}
	//====================================================================================
	@Then("click on gender radio button")
	public static void Title(DataTable data) {
	
	
		boolean status;
		if(status = true)
		{
			Registerpage_details radio =PageFactory.initElements(driver, Registerpage_details.class);
			Registerpage_details.Title(data);
		}
		}
	//==========================================================================================
	
	/*@And("click on create account button to navigate to register page") 
	public static void clickoncreateaccount()
	{
		//click on create account button
		driver.findElement(By.xpath("//div[@class='submit']/button[@id='SubmitCreate']")).click();
		
		if(stepstatus=true)
		{
			System.out.println("Register page opened");
			
		}else
		{
			System.out.println("Register page not open");
		}
	}*/
	
	//=======================================================================================
	@Then("verify register page personal details elements First name,Lastname,Email, password,Date of Birth elements and chcekboxes")
	public static void getTitle(DataTable data)
	{
		boolean status;
		if(status = true)
		{
			Registerpage_details enterdetails =PageFactory.initElements(driver, Registerpage_details.class);
			Registerpage_details.Registerdetails(data);
			Registerpage_details.dateEnter();
			Registerpage_details.checkboxes();
		}
	}
		
		//driver.findElement(By.xpath("//h3[text()='Your personal information']"));
	//driver.findElement(By.xpath("//div[@class='account_creation']/child::div[1]"));
//=====================================================================================	
	@Then("verify your address elements First name,Lastname, company and address")
	public static void Address_information(DataTable data)
	{
		boolean status;
		if(status = true)
		{
			Registerpage_details Addressinfo =PageFactory.initElements(driver, Registerpage_details.class);
			Registerpage_details.companydetails1(data)	;
			//Registerpage_details.companydetails(data);
//			Registerpage_details.Adressdetails(data);
//			Registerpage_details.Adress2details(data);
		}
	}
//==============================================================================================	
		@Then("verify City,State,Zip/Postal Code,Country elements")
		
		public static void postal_information(DataTable data)
		{
			boolean status;
			if(status = true)
			{
				Registerpage_details postalinfo =PageFactory.initElements(driver, Registerpage_details.class);
				Registerpage_details.cityname(data);	
				Registerpage_details.stateEntry1();
				Registerpage_details.postal1(data);
				Registerpage_details.countryEntry1();
			}		

		}
//================================================================================================
		@Then ("verify Additional information,Home phone,Mobile phone,Assign an address alias for future reference elements")
		public static void Additionalinformation(DataTable data)
		{
			boolean status;
			if(status = true)
			{
				Registerpage_details additioninfo =PageFactory.initElements(driver, Registerpage_details.class);
				Registerpage_details.additioninfo(data);	
//				Registerpage_details.Additionalinfo(data);
//				Registerpage_details.Homenumber(data);
//				Registerpage_details.Mobilenumber(data);
//				Registerpage_details.AssignAddress(data);
	}
}
//=======================================================================================
		@Then ("verify the details entered in register page and click on register")
		public static void Registerbutton()
		{
			boolean status;
			if(status = true)
			{
				Registerpage_details register =PageFactory.initElements(driver, Registerpage_details.class);
				
				Registerpage_details.Register();
			Registerpage_details.RegisterPageDispaly();
			}
			
			driver.close();
		}
			
			
		
		

		

}


	


