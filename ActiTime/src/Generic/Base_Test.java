package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}
