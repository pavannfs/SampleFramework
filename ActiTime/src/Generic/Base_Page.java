package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class Base_Page 
{
	public WebDriver driver;
	
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String etitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
		}
	}
	
	public void verifyElementIsPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
	
}
