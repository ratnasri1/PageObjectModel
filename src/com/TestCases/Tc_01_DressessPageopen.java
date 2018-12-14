package com.TestCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class Tc_01_DressessPageopen extends GenericMethods{

	public static boolean stepstatus;
	
	@Given("Launch the firefox browser")
	public static void launchBrowser(DataTable data)
	{
		List<List<String>> url= data.raw();
		stepstatus = GenericMethods.launchBrowser("ff", url.get(0).get(0));
		
		
		}
	


		
	@When("click on dresses option and text should display")
	
	public static void navigatetodressespage()
	{
		//click on dresses page and display text in dresses page
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a[text()='Dresses']"));
		stepstatus= GenericMethods.hoverAndClick(ele);
		if(stepstatus)
		{
			String pagetext = driver.findElement(By.xpath("//div[@id='categories_block_left']/h2")).getText();
			if(pagetext.equalsIgnoreCase("Dresses"))
				System.out.println("\n"+ "Dresses page is displyed");
		}
	}
		
		 /*driver.findElement(By.linkText("DRESSES")).click();
		 boolean status = true;
			if(status)
			{
				System.out.println("Dresses page is clicked");
				
			}
			else{
				System.out.println("Dresses page is not clicked");
			}
			//stepstatus = GenericMethods.imagesdisplay();
		//stepstatus = GenericMethods.linksdisplay();
		//stepstatus = GenericMethods.checkboxes();
		
			} */
	

/*@Then("verify dresses page text displayed")
	public static void DressesPageDis() {
		
		driver.findElement(By.xpath("//span[@class='category-name']")).isDisplayed();
		boolean status = true;
		if(status)
		{
			System.out.println("Dresses page is displayed");
			
		}
		else{
			System.out.println("Dresses page is not displayed");
		}*/
		
	

	

}



	
