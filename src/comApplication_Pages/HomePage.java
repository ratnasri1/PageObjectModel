package comApplication_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class HomePage extends GenericMethods{
	
	//************************  Web Elements ******************************
	
	@FindBy(how=How.CSS,using="span[id='lnkRegistration']")
	public static WebElement Lnk_Register;
	
	@FindBy(how=How.CSS,using="span[id='lblRecruiterReg']")
	public static WebElement link_Recruiter;
	
	//*********************************************************************
	
	
	//================================ Methods for Home Page ===============================
	
	
	/*
	 * Method Name 		: clickRegisterLink
	 * Purpose			: to click on register
	 * Input Parameters	: CSS selector
	 * Return Type		: boolean
	 * Dependency		: open the webpage(talentzing) and click on registerlink
	 * Date of Creation	: 22/11/2018
	 * Created By		: RatnaSri
	 * Reviewed By		:
	 * Modified Date	:
	 */
	
	
		
	public static boolean clickRegisterLink()
	{
	boolean status= hoverAndClick(Lnk_Register);
		
		/*try
		{
			Lnk_Register.click();
		}catch(Exception e)
		{
			status=false;
			
			System.out.println(e.getMessage());
		}*/
		return false;
	}
	
	}


