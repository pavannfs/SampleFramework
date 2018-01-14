package Scripts;

import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Excel;
import POM.LoginPage;

public class InvalidLoginLogout extends Base_Test 
{
	@Test
	public void testInvalidLoginLogout()
	{
		String un = Excel.getcellValue(PATH, "InvalidLoginLogout", 1, 0);
		String pwd = Excel.getcellValue(PATH, "InvalidLoginLogout", 1, 1);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clickLogin();
		lp.verifyErrMsg();
	}
}
