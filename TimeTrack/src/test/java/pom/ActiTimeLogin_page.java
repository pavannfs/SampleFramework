package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class ActiTimeLogin_page extends Base_Page
{
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	
	public ActiTimeLogin_page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterUN(String UN)
	{
		un.sendKeys(UN);
	}
	
	public void enterPWD(String PWD)
	{
		pwd.sendKeys(PWD);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
}
