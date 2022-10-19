package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
      WebDriver ldriver;
	
	public SignupPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(how = How.XPATH, using="//button[normalize-space()='Register']")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.NAME, using="Gender")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.NAME, using="FirstName")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME,using="LastName")
	@CacheLookup
	WebElement txtlastname;
	
	@FindBy(how = How.ID_OR_NAME, using="DateOfBirthDay")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using="Email")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how = How.NAME, using="Company")
	@CacheLookup
	WebElement txtcompanydetail;
	
    @FindBy(how = How.NAME, using="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how = How.NAME, using="ConfirmPassword")
	@CacheLookup
	WebElement txtconfirmpassword;
	
	@FindBy(how = How.NAME, using="register-button")
	@CacheLookup
	WebElement registerbutton;
	
	public void NewAccount()
	{
	  lnkAddNewCustomer.click();	
	}
	public void uGender(String ugender) 
	{
		rdGender.sendKeys(ugender);
	}
	public void uname(String uname)
	{
	  txtCustomerName.sendKeys(uname);	
	}
	public void uLastname(String ulastname) 
	{
	 txtlastname.sendKeys(ulastname);	
	}
	public void DateofBirth(String dd,String mm,String yy) 
	{
	   txtdob.sendKeys(dd);
	   txtdob.sendKeys(mm);
	   txtdob.sendKeys(yy);
	   
	}
   public void uemail(String uemail)
   {
	   txtemailid.sendKeys(uemail);
	
   }
   public void ucompanydetail(String ucomp )
   {
	   txtcompanydetail.sendKeys(ucomp);
   }
   public void upassword(String upass)
   {
	  txtpassword.sendKeys(upass);
   }
   public void uconfpass(String uconfpass)
   {
	 txtconfirmpassword.sendKeys(uconfpass);
   }
   public void clickbutton()
   {
	 registerbutton.click();
   }
	
	

}
