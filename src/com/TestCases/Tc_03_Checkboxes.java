package com.TestCases;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.GenericMethods.GenericMethods;

import cucumber.api.java.en.Given;

public class Tc_03_Checkboxes extends GenericMethods {

	
		
		@Given("Dresses menu should display sub menus in that dispaly how many checkboxes")
		public static void Checkboxesclick()
		{
			
			 	 boolean status=true;
				 Scanner sc = new Scanner(System.in);
				System.out.println("checkboxes is selected");
				
				int value = sc.nextInt();
			
				
					switch (value)
					{
					
					case 1:
						driver.findElement(By.xpath("//label/*[text()='Evening Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).click();
					status=	driver.findElement(By.xpath("//label/*[text()='Evening Dresses']/parent::label/preceding-sibling::div/span/input[@type='checkbox']")).isSelected();
					if (status = true)
					{
						System.out.println("evening dresses clicked");
					}
					else
					{
						
						System.out.println("evening dresses is not clicked");
					break;
					}
					}
					


		}
}


