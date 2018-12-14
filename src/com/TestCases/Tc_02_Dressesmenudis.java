package com.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.Given;

public class Tc_02_Dressesmenudis  extends GenericMethods{

	
	
		@Given("Dresses menu opened and menus are present")
		
		public static void dressesmenu()
		{
			
	//Verify options under dresses menu
			System.out.println("\n"+"validating whether all the dresses option causual dresses, evening dresses,summer dresses");
		
	//Create a string array with options which we want to verify under dresses menu
			
			String[] menuoptions= {"Casual Dresses", "Evening Dresses", "Summer Dresses"};
			int menuoptionslength= menuoptions.length;
			
	// get menu options display on the application
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> app_options = driver.findElements(By.xpath("//div[@id='categories_block_left']/div/ul/li"));
			int applength = app_options.size();
			
	//compare the options displayed on the application with the string list
			for (int i = 0; i<menuoptionslength;i++)
			{
				boolean status = false;
			for (WebElement option: app_options)
			{
				String item = option.getText().trim();
				if(menuoptions[i].equalsIgnoreCase(item))
				{
					System.out.println(menuoptions[i]+ "option is present under Dresses menu");
					
					status = true;
					break;
				}
			}
			
			if(status ==false)
				System.out.println(menuoptions[i]+ "option is missing under Dresses menu");
				
			}
			
			
	}

}
