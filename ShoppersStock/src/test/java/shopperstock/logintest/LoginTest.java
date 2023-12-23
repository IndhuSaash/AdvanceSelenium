package shopperstock.logintest;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Shopperstackfileutility.ReadProperties;
import shoppersstack.baseclass.BaseClass;
import shoppersstack.obbjectrepository.LoginPage;
import shoppersstack.obbjectrepository.WelcomePage;
@Listeners(Listnerimplmentation.Listner.class)
public class LoginTest  extends BaseClass {
	
	//@Test (retryAnalyzer = Listnerimplmentation.RetryListner.class)
	@Test
	public  void loginTest() throws Throwable
	{
		ReadProperties properties = new ReadProperties();
		String username = properties.getDataFromProperty("username");
		String password = properties.getDataFromProperty("password");
		
		WelcomePage wel = new WelcomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wel.getLoginButton().click();
			LoginPage  log = new LoginPage(driver);
			log.getEmailTextField().sendKeys(username);
		log.getPasswordTextField().sendKeys(password);
		
			log.getLoginButton().click();
				
		}	
	}


