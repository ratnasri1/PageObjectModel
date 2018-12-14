package comApplication_Pages1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;


public class createAccount extends GenericMethods{

	@FindBy(how=How.XPATH,using="//input[@id='email_create']") 
	public static WebElement enteremail;

	@FindBy(how=How.XPATH,using="//div[@class='submit']/button[@id='SubmitCreate']") 
	public static WebElement buttonclick;
	
	@FindBy(how=How.CSS,using= "h1[@class='page-heading']") 
	public static WebElement Registerpage_dispaly;
	
//=======================================================================

public static boolean enterEmailid(DataTable data)
{
	List<List<String>> email= data.raw();
	String emailid=email.get(0).get(0);
	String[] arr = emailid.split("@");
	Date d = new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("hhmmss");
	System.out.println(arr[0]+sdf.format(d)+"@"+arr[1]);
	emailid=arr[0]+sdf.format(d)+"@"+arr[1];

	//stepstatus = GenericMethods.clickAndSendData(enteremail.sendKeys(email.get(0).get(0)));
	GenericMethods.clickAndSendData(enteremail,emailid );
	System.out.println("emailID entered");
return false;
}
//===========================================================================
public static boolean clickbutton()
{
	boolean status= ClickElement(buttonclick);
	return true;
}
//==================================================================================
	
	public static boolean RegisterPageDispaly( )
	{
		boolean status = isExist(Registerpage_dispaly);
		System.out.println("Register page display");
		return false;
	
}




}

