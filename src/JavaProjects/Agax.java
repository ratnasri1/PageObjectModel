package JavaProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Agax {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Hello");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@id='uh-search-box']//following-sibling::div//div/div/ul/li"));
		System.out.println("no.of elements:"+elements.size());
		
		for( int i=1;i<=elements.size();i++)
		{
			
			
			WebElement element1 = driver.findElement(By.xpath("//input[@id='uh-search-box']//following-sibling::div//div/div/ul/li["+i+"]"));
			String ele = element1.getText();
			System.out.println(ele);
			
		if (ele.startsWith("hello"))
		{
			System.out.println("enter the all hello statements");
		}
		}
	}

}
