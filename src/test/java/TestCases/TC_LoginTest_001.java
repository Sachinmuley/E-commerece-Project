package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void  loginTest() throws Exception
	{
        LoginPage lp=new LoginPage(driver);
	    lp.setUserName(username);
	    lp.setPassword(password);
	    lp.clickSubmit();
	    
	    
	    }
}