package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class OrangeHrmTest extends BaseClass
{
	
	@Test
	public void TestLogin() 
	{
		logger.info("Strating OrangeHrmTest");
		try {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Admin");
		logger.info("Provided User Name ");
		lp.setPassword("admin123");
		logger.info("Provided Password");
		lp.clickLogin();
		logger.info("Clicked on Login ");
	}
	
	catch(Exception e)
	{
		Assert.fail();
	}

	logger.info("Finished OrangeHrmTest");
	
}
}
