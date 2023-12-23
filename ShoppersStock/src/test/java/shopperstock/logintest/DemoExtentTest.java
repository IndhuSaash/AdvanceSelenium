package shopperstock.logintest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import shoppersstack.baseclass.BaseClass;
@Listeners(Listnerimplmentation.Listner.class)
public class DemoExtentTest  extends BaseClass{
	@Test
	public void demoTest()
	{
		
		//ExtentReports  report = new  ExtentReports("./AdvanceReports/demoTest.html");
		//ExtentTest test = report.startTest("demotest");
		test.log(LogStatus.INFO, "Homepage is displayed successfully");
		Assert.fail();
		//test.log(LogStatus.FAIL, "homepage not diaplsyed ");
		
		//report.endTest(test);
		//report.flush();
		
	}
	

}
