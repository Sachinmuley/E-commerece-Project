package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ConfigDataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {
	
    
	public static ConfigDataProvider config;
	
	public  String baseURL="https://demo.nopcommerce.com/login";
	public  String username="muleysachin999@gmail.com";
	public  String password="123456789";
	public  WebDriver driver;

	
@BeforeClass	
 public void setup()
{    
	WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();

	   driver.get(baseURL);
	   
	   driver.manage().window().maximize();
	   
	   
 }
@AfterClass
 public void tearDown()
 {
	 try {  
	 driver.quit();
     }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
 

}
}

