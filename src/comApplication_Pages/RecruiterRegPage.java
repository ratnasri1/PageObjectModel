package comApplication_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

public class RecruiterRegPage extends GenericMethods {
	
	//************************  Web Elements ******************************

	@FindBy(how=How.CSS,using="span[id='lblRecruiterReg']")
	public static WebElement link_Recruiter;

	//==============================================================
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


	//================================ Methods for Navigate to recruiter page ===============================
	
	public static boolean navigatetoRecruiter()
	{
		boolean status= hoverAndClick(link_Recruiter);
	/*try
	{
		link_Recruiter.click();
	}
	
	catch(Exception e)
	{
		status=false;
		
		System.out.println(e.getMessage());
	}*/
	
	return false;
	}
}