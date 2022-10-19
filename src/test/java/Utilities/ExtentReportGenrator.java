package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports()
	{
	String reportPath="C:\\Users\\sai\\eclipse-Automation testing\\Flipkart\\Reports\\index.html";
    ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
    
     reporter.config().setDocumentTitle("AutomationTest Report");
    reporter.config().setReportName("E-Commerce project");
    reporter.config().setTheme(Theme.DARK);
    
 extent=new ExtentReports();
    extent.attachReporter(reporter);
    
    extent.setSystemInfo("ProjectName","E-Commerce project");
    extent.setSystemInfo("Module","Automation Test Module");
    extent.setSystemInfo("Tool","Selenium");
    extent.setSystemInfo("QA Name","Sachin");
	return extent;
    
    
}
}