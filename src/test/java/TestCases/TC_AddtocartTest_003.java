package TestCases;

import org.testng.annotations.Test;

import PageObjects.AddToCartPage;
import PageObjects.LoginPage;



public class TC_AddtocartTest_003 extends BaseClass {
	
	@Test
	public void Addtocart() throws Exception
	{
		
		LoginPage login=new LoginPage(driver);
		  
		  login.setUserName(username);
		  login.setPassword(password);
		  login.clickSubmit();
		
	    Thread.sleep(100);
	    
	  AddToCartPage add=new AddToCartPage(driver);
	  
	     add.CheckBox("Apple MacBook Pro 13-inch");
	     add.SearchButton();
	     add.Addtocart();
	     add.shoppingcart();
	     
	     Thread.sleep(1000);
	     
	//  ReadConfig.screenshot(driver);
	  
	    
	     
	    
	    
	    
	}

}
