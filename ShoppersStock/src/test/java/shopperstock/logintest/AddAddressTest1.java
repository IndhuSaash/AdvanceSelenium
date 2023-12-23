package shopperstock.logintest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.obbjectrepository.AddAddress;
import shoppersstack.obbjectrepository.HomePage;
import shoppersstack.obbjectrepository.ProfileButton;

public class AddAddressTest1 extends BaseClass  {

	
	
@Test
public void Address() throws InterruptedException

{

	HomePage home = new HomePage(driver);
	home.getSettings_button().click();
	AddAddress add = new AddAddress(driver);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Thread.sleep(9000);
	ProfileButton profile = new ProfileButton(driver);
	profile.getMyprofile().click();
	add.getAddAddress_Button().click();
	add.getAddAddress1().click();
	add.getHouse_button().sendKeys("indhu");
	add.getName_field().sendKeys("mathi");
	add.getStreetinfo().sendKeys("mathi898");
	add.getLandmark().sendKeys("pram");
	add.getPhonenumber().sendKeys("9789090329");
	add.getPincode().sendKeys("600026");
	
	
	Select dropdown = new Select (add.getCountry());
	
	dropdown.selectByVisibleText("India");
	

	Select dropdown1 = new Select (add.getState());
	dropdown1.selectByVisibleText("Tamil Nadu");
	
	Select dropdown2 = new Select (add.getState());
	dropdown2.selectByVisibleText("Chennai");
	
	Reporter.log("sucess" , true);
	
}
	
}
