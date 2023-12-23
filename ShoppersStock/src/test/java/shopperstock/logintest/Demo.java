package shopperstock.logintest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Listnerimplmentation.Listner;
import shoppersstack.baseclass.BaseClass;
@Listeners(Listnerimplmentation.Listner.class)
public class Demo extends BaseClass{

	@Test
	public void demoTest() {
		System.out.println("Test running");
		
	}
	
	@Test
	public void demoTest1() {
		Assert.fail();
		System.out.println("Test fail");
		
		
	}
}
