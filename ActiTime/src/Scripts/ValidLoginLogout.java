package Scripts;

import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Excel;
import POM.EnterTimeTrack;
import POM.LoginPage;

public class ValidLoginLogout extends Base_Test
{
	@Test
	public void testValidLoginLogout()
	{
		String un = Excel.getcellValue(PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getcellValue(PATH, "ValidLoginLogout", 1, 1);
		String lp_title = Excel.getcellValue(PATH, "ValidLoginLogout", 1, 2);
		String hp_title = Excel.getcellValue(PATH, "ValidLoginLogout", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clickLogin();
		//System.out.println(hp_title);
		EnterTimeTrack ep=new EnterTimeTrack(driver);
		ep.verifyPageTitle(hp_title);
		ep.clickLogout();
		lp.verifyLoginPage(lp_title);
	}
}
