package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	
	public static ExtentTest test;
	
	public static void screenshot(WebDriver driver) throws Exception
	{
		 String rm=RandomString.make(5); // random string take screen shot
	     TakesScreenshot ts=(TakesScreenshot) driver;
	       File src=ts.getScreenshotAs(OutputType.FILE);
	       
	       File destn=new File("C:\\Users\\sai\\eclipse-Automation testing\\E-Commerce_project\\Screenshot\\"+rm+".png");
	       
	       FileUtils.copyFile(src, destn);
	}
	

}
