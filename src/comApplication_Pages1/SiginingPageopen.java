package comApplication_Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class SiginingPageopen extends GenericMethods {

		
		//************************  Web Elements ******************************
		
		@FindBy(how=How.XPATH,using="//div[@class='container']/div/nav/div[@class='header_user_info']") 
		public static WebElement login;
	
		@FindBy(how=How.XPATH,using="//div[@class='col-xs-12 col-sm-6']/form/h3']") 
		public static WebElement Accountpage;
		
		//*********************************************************************
		
		
		
		public static boolean clicksigningLink()
		{
		boolean status= hoverAndClick(login);
		return false;
	}
		//========================================================================
		public static boolean accountPageDispaly( )
		{
			boolean status = isExist(Accountpage);
			System.out.println("accountpagedisplay");
			return false;
				
			
		}
		}
		



