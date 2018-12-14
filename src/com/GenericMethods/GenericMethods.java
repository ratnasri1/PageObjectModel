package com.GenericMethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	private static final boolean Status = false;
	public static WebDriver driver;
	
	
	
	public static boolean launchBrowser(String browser, String url)
	{boolean status=true;
	System.out.println("Launching browser");
	try
	{
		switch(browser.toLowerCase().trim())
		{
		
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			
			System.getProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
			driver= new ChromeDriver();
		break;
		
		}
	}catch(Exception e)
	{
		status=false;
		System.out.println(e.getMessage());
	}
		// Verify if browser is opned sucessfull
	if(status)
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
	System.out.println("Launching browser is completed");
		return status;
	}
	
//====================================================================================	
	public static boolean hoverAndClick(WebElement element)
	{
		boolean status=true;
		
		//verify the mouse over element is clicked
		try
		{
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
			Actions act=new Actions(driver);
			act.moveToElement(element).click(element).build().perform();
			if(status)
			{
			System.out.println("moseover performed");
			}
			
			else{
				System.out.println("moseover not performed");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			//return true;
		}
		return status;
	}
//=======================================================================================	
	public static boolean clickAndSendData(WebElement element,String data)
	{
		boolean status=true;
		//verify element is clicked and send data.
		try
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
			element.click();
			element.clear();
			element.sendKeys(data);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			status=false;
		}
		return status;
	}
	//=======================================================================
public static boolean linksdisplay()
	
	{
	try{
		boolean Status = true;
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no.of links:"+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifylinkactive(url);
					}
	}
		catch(Exception e)
		{
			return Status;
		}
	return false;
		
	}
public static boolean verifylinkactive(String linkurl)
			
			{
				try
				{
				URL url = new URL(linkurl);
				HttpURLConnection httpURLConnect =(HttpURLConnection)url.openConnection();
				httpURLConnect.setConnectTimeout(3000);
				httpURLConnect.connect();
				if(httpURLConnect.getResponseCode()==200)
				{
					System.out.println(linkurl+" / "+httpURLConnect.getResponseMessage());
					}
				
					if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
					{
						System.out.println(linkurl+"-"+httpURLConnect.getResponseMessage());
					}
				}
				catch(Exception e)
			{
					
				}
				return false;
	
			}

			

//=================================================================================

public static boolean imagesdisplay()

{
	boolean Status = true;
try{
	
	 List<WebElement> images = driver.findElements(By.xpath("img"));
	System.out.println("no.of images:"+images.size());
	for(int i=0;i<images.size();i++)
	{
		WebElement ele = images.get(i);
		
		if(Status){
		System.out.println("images name:"+images.get(i).getText());
		System.out.println("images fontsize:"+images.get(i).getCssValue("font-size"));
		System.out.println("images Color:"+images.get(i).getCssValue("color"));
		}
	else
	
	System.out.println("images not displayed");
	}
}
	catch(Exception e)
	{   
		return false;
	}
		return Status;

}

//===============================================================

public static boolean checkboxes()

{
	boolean Status = true;
try{
	
	 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 int n = checkbox.size();
	 String check[] = new String[n];
	System.out.println("no.of checkboxes:"+checkbox.size());
	for(int i=0;i<checkbox.size();i++)
	{
		check [i] = checkbox.get(i).getAttribute("type");
		System.out.println("check box name display");
	checkbox.get(i).click();
	
		System.out.println("no. of checkboxes clicked:" +i);
		
		
		if(Status){
		//System.out.println("checkbox name:"+checkbox.get(i).isEnabled());
		System.out.println("checkbox name:"+checkbox.get(i).getLocation());
		
		}
	else
	
	System.out.println("checkbox name not displayed");
	}
}
	catch(Exception e)
	{   
		return false;
}
return Status;
}


//=======================================================================================

public static boolean isExist(WebElement element)
{
	try
	{
	boolean status;
	element.isDisplayed();
	
	status = true;
}
	catch (Exception e)

{
	boolean status = false;
}
return Status;

}
//=================================================================================

public static boolean ClickElement(WebElement element)
{
	try
	{
	boolean status;
	element.click();
	
	status = true;
}
	catch (Exception e)

{
	boolean status = false;
}
return Status;


}
}

		
		

