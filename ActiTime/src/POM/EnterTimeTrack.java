package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.Base_Page;

public class EnterTimeTrack extends Base_Page
{
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="(//div[@class='popup_menu_label'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutActitime;
	
	@FindBy(xpath="//span[.='actiTIME 2017.4']")
	private WebElement version;
	
	@FindBy(xpath="//div[@class='closeButton' and @id='aboutPopupCloseButtonId']")
	private WebElement close;
	
	public EnterTimeTrack(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logout.sendKeys(Keys.ENTER);
	}
	
	public void clickHelp()
	{
		verifyElementIsPresent(help);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", help);
	}
	
	public void clickAboutActitime()
	{
		verifyElementIsPresent(aboutActitime);
		aboutActitime.click();
	}
	
	public void verifyVersion(String eversion)
	{
		String aversion=version.getText();
		Assert.assertEquals(aversion, eversion);
	}
	
	public void clickClose()
	{
		close.click();
	}
	
	public void verifyPageTitle(String etitle) 
	{
		
		verifyTitle(etitle);
	}
}
