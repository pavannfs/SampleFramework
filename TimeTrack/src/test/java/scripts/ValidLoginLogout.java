package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.ActiTimeHome_page;
import pom.ActiTimeLogin_page;

public class ValidLoginLogout extends Base_Test
{
	@Test
	public void testValidLoginLogout()
	{
		String user=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		String pass=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		ActiTimeLogin_page lp=new ActiTimeLogin_page(driver);
		lp.enterUN(user);
		lp.enterPWD(pass);
		lp.clickLogin();
		ActiTimeHome_page hp=new ActiTimeHome_page(driver);
		hp.clickLogout();
	}
}
