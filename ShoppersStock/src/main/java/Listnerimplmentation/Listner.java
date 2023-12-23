package Listnerimplmentation;
  import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericutility.JavaUtility;
import shoppersstack.baseclass.BaseClass;

public class Listner implements  ITestListener , ISuiteListener  {
	  public static ExtentReports report;
	  public static  ExtentTest test;
	  
	  
	@Override
	public void onStart(ISuite suite) {
		Reporter.log(suite.getName()+"has started" , true);
		JavaUtility java = new JavaUtility();
	String time=JavaUtility.getDateAndTime();
		report = new ExtentReports("./AdvanceReports/"+suite.getName()+time+".html");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		  Reporter.log(result.getName()+"test has started " , true);
		  
		  test = report.startTest(result.getName());
		  test.log(LogStatus.INFO, "test has been started");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		 String imgPath = "./FailedScreenshots/"+result.getName()+".png";
		
		  TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		  
		  File ss = ts.getScreenshotAs(OutputType.FILE);
		  File path = new File(imgPath);
		  try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  test.log(LogStatus.FAIL, "test is failed");
		  
		  Reporter.log(result.getName()+"test has failed " , true);
		  test.log(LogStatus.INFO , test.addScreenCapture("."+imgPath));
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	
		Reporter.log(result.getName()+"test is passes");
		
		test.log(LogStatus.PASS, "test is passed");
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
Reporter.log(result.getName()+"test is  skipp");
		
		test.log(LogStatus.INFO, "test is skip");
		
		
	}
	  @Override
	public void onFinish(ISuite suite) {
	
		  Reporter.log(suite.getName()+"test is  done");
			
			test.log(LogStatus.INFO, "test is done");
			

			  report.endTest(test);
			  report.flush();
			
	}
}


