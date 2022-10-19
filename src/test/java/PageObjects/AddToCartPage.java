package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	   WebDriver ldriver;
		
		public AddToCartPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		  
		   @FindBy(id="small-searchterms")
		   WebElement checkbox;
		    
		   @FindBy(xpath="//button[normalize-space()='Search']")
		   @CacheLookup
		   WebElement searchbutton;
		   
		   @FindBy(xpath="//button[normalize-space()='Add to cart']")
		   @CacheLookup
		   WebElement Addtocartbutton;
		   
		   @FindBy(xpath="//span[@class='cart-label']")
		   @CacheLookup 
		   WebElement shoppingcart;
		   
		   
		   
		   
		   public void CheckBox(String item)
		   {
			   checkbox.sendKeys(item);
		   }
		   public void SearchButton()
		   {
			   searchbutton.click();
		   }
		   public void Addtocart()
		   {
			   Addtocartbutton.click();
		   }
		   public void shoppingcart()
		   {
			   shoppingcart.click();
		   }
		   
		
		

}
