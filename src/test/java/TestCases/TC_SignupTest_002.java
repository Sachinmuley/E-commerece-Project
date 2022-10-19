package TestCases;

import org.testng.annotations.Test;

import PageObjects.SignupPage;

public class TC_SignupTest_002 extends BaseClass {
	
	@Test
	public void addnewAccount()
	{
		SignupPage set=new SignupPage(driver);
		 
		   set.NewAccount();
		   set.uGender("male");
		   set.uname("rahul");
		   set.uLastname("muley");
		   set.DateofBirth("10","02","1997");
		   set.uemail("rahulm@gmail.com");
		   set.ucompanydetail("dhoot compy");
		   set.upassword("12345");
		   set.uconfpass("12345");
		   set.clickbutton();
		
		
	}

}
