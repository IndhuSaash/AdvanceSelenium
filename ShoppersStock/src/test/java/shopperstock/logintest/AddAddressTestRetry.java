package shopperstock.logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import shoppersstack.baseclass.BaseClass;
@Listeners(Listnerimplmentation.Listner.class)
public class AddAddressTestRetry extends BaseClass {

	@Test (retryAnalyzer = Listnerimplmentation.RetryListner.class)
	
	public void addAddressTest()
	{
		Assert.fail();
		Reporter.log("Address added " , true);
		
	}
	
	
	
	
	// Hard Assertion
	@Test
	public void addAddress1()
	
	{
		WebElement editbutton = driver.findElement(By.xpath(""));
		
		Assert.assertEquals(editbutton.isDisplayed(), true);
		Reporter.log("Address added " , true);
		
		
	}
	

//SoftAssert
@Test
public void addAddress2()

{
	
	String title = "Shopper";
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(title, "tack");
	
	Reporter.log("correct" , true);
	soft .assertAll();
}

}
	
	
