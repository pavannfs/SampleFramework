package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}
}
