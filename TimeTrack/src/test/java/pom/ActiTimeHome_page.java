package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class ActiTimeHome_page extends Base_Page
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public ActiTimeHome_page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogout()
	{
		verifyElementPresent(logout);
		logout.click();
	}
}
