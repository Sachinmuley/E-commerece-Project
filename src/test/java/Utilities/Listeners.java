package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	
	
	ExtentReports extent=ExtentReportGenrator.getReports();
  
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result)
	{
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod());
	    extenttest.set(Library.test);
	
	}

	public void onTestSuccess(ITestResult result) 
	{
		extenttest.get().log(Status.PASS,"Test Case Pass");
	
	}

	public void onTestFailure(ITestResult result)
	{
		extenttest.get().log(Status.FAIL,"Test Case Fail");

	}

	public void onTestSkipped(ITestResult result)
	{
	  extenttest.get().log(Status.SKIP,"Test Case Skip");
	}

	public void onFinish(ITestContext context) 
	{
       extent.flush();
		
	}
	
	

}
