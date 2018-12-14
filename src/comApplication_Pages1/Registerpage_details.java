package comApplication_Pages1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericMethods.GenericMethods;

import cucumber.api.DataTable;

public class Registerpage_details extends GenericMethods{

	@FindBy(how=How.XPATH,using="//input[@id='id_gender1']") 
	public static WebElement Mr_button;
	
	@FindBy(how=How.XPATH,using="//input[@id='customer_firstname']") 
	public static WebElement first_name;

	@FindBy(how=How.XPATH,using="//input[@id='customer_lastname']") 
	public static WebElement last_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']") 
	public static WebElement PassWd;
	
	@FindBy(how=How.XPATH,using="//select[@id='days']/option[@value='1']") 
	public static WebElement date_sel;
	
	@FindBy(how=How.XPATH,using="//select[@id='months']/option[@value='1']") 
	public static WebElement month_sel;
	
	@FindBy(how=How.XPATH,using="//select[@id='years']/option[@value='2018']") 
	public static WebElement year_sel;
	
	@FindBy(how=How.XPATH,using="//input[@id='newsletter']") 
	public static WebElement checkbox_news;
	
	@FindBy(how=How.XPATH,using="//input[@id='optin']") 
	public static WebElement checkbox_spl;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='company']") 
	public static WebElement company_details;
	
	@FindBy(how=How.XPATH,using="//input[@id='address1']") 
	public static WebElement Address_details;
	
	@FindBy(how=How.XPATH,using="//input[@id='address2']") 
	public static WebElement Address2_details;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='city']") 
	public static WebElement City_details;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_state']/option[@value='32']") 
	public static WebElement State_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='postcode']") 
	public static WebElement Postal_details;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_country']/option[@value='21']") 
	public static WebElement country_details;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='other']") 
	public static WebElement Additional_details;
	
	@FindBy(how=How.XPATH,using="//input[@id='phone']") 
	public static WebElement homephone_details;
	
	@FindBy(how=How.XPATH,using="//input[@id='phone_mobile']") 
	public static WebElement mobile_details;
	
	@FindBy(how=How.XPATH,using="//input[@id='alias']") 
	public static WebElement AssignAddress_details;
		
	@FindBy(how=How.XPATH,using="//button[@id='submitAccount']/span") 
	public static WebElement Register_button;
	
	@FindBy(how=How.XPATH,using="//div[@id='center_column']/h1") 
	public static WebElement Register_display;
	
	
	//===============================================================================
	
	public static boolean Title(DataTable data)
	{
		try{
			List<List<String>> gender= data.raw();
			String radiobutton= gender.get(0).get(0);
			
		if(radiobutton.trim().equalsIgnoreCase("Mr"))
		{
			GenericMethods.hoverAndClick(Mr_button);
			
			System.out.println("Mr is clicked");
		}
		
		else{
			System.out.println("Mr is not clicked");
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
	}
		return false;
	}
				
		
//==================================================================================		
	

		//enter firstname
				
			public static boolean Registerdetails(DataTable data)
				{
				
				List<List<String>> last= data.raw();
				
				String first = last.get(0).get(0);
				GenericMethods.clickAndSendData(first_name,first );
				System.out.println("first name enetered");
				
				String Last = last.get(0).get(1);
				GenericMethods.clickAndSendData(last_name,Last);
				System.out.println("last name enetered");
				
				String password = last.get(0).get(02);
				GenericMethods.clickAndSendData(PassWd,password );
				System.out.println("password enetered");
				return false;
				}
	
	//=============================================================================			
				public static boolean dateEnter() {
		
	
				{
				boolean status= ClickElement(date_sel);
				boolean status1= ClickElement(month_sel);
				boolean status2= ClickElement(year_sel);
			System.out.println("date entered");
				}
				return false;
}

			
				public static boolean checkboxes()
				{
			boolean status3= ClickElement(checkbox_news);
			System.out.println("news checkbox clicked");
			boolean status4= ClickElement(checkbox_spl);
			System.out.println("special checkbox clicked");
				
				return false;
}
				//=========================================
				
		public static boolean companydetails1(DataTable data)
		{
			
			List<List<String>> last= data.raw();
			String comapny = last.get(0).get(0);
			GenericMethods.clickAndSendData(company_details,comapny );
			System.out.println("comapny name enetered");
			
			String Address = last.get(0).get(1);
			GenericMethods.clickAndSendData(Address_details,Address );
			System.out.println("Address enetered");
			
			String Address2 = last.get(0).get(2);
			GenericMethods.clickAndSendData(company_details, Address2);
			System.out.println("Address2 enetered");
			return false;
		}
	//=========================================================================		
			public static boolean cityname(DataTable data)
			{
				List<List<String>> last= data.raw();				
			String city = last.get(0).get(0);
			GenericMethods.clickAndSendData(City_details,city );
			System.out.println("city name enetered");
		
		return false;
		}
//=================================================================================			
		public static boolean stateEntry1()
		{
			boolean status5= ClickElement(State_name);
			System.out.println("State name clicked");
			return false;
		}
		
		
		public static boolean postal1(DataTable data)
		{
			List<List<String>> last= data.raw();
			String postal = last.get(0).get(1);
			GenericMethods.clickAndSendData(Postal_details,postal );
			System.out.println("postal details enetered");
			return false;
		}
	//=========		
			public static boolean countryEntry1()
			{
			boolean status6= ClickElement(country_details);
			System.out.println("country clicked");
			return false;
			}
			
	//==============================================		
			public static boolean additioninfo(DataTable data)
			{
				List<List<String>> last= data.raw();
			String Additionalinfo = last.get(0).get(1);
			GenericMethods.clickAndSendData(Additional_details,Additionalinfo);
			System.out.println("Addition details enetered");
			
			
			String homenumber = last.get(0).get(1);
			GenericMethods.clickAndSendData(homephone_details,homenumber);
			System.out.println("homenumber details enetered");
			
			
			String mobilenumber = last.get(0).get(2);
			GenericMethods.clickAndSendData(mobile_details,mobilenumber);
			System.out.println("mobilenumber details enetered");
			
			String assignadd = last.get(0).get(3);
			GenericMethods.clickAndSendData(AssignAddress_details,assignadd);
			System.out.println("AssignAddress details enetered");
			 return false;
			}
			
			
			
			// Register clicked
			public static boolean Register()
			{
				boolean status= ClickElement(Register_button);
				System.out.println("Register clicked");
				return false;
			}
			
			//Register page display
			public static boolean RegisterPageDispaly( )
			{
				boolean status = isExist(Register_display);
				System.out.println("My account page displayed ");
				return false;
			
}
}

			
			

