package shoppersstack.baseclass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Listnerimplmentation.Listner;
import Shopperstackfileutility.ReadProperties;
import shoppersstack.obbjectrepository.HomePage;
import shoppersstack.obbjectrepository.LoginPage;
import shoppersstack.obbjectrepository.WelcomePage;

public class BaseClass extends Listner{
 public WebDriver driver;
 
  public static  WebDriver sdriver;
  




	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		
		
		driver = new ChromeDriver();
		sdriver= driver;
		
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws Throwable 
	{
		ReadProperties properties = new ReadProperties();
		String url = properties.getDataFromProperty("url");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 	
		WelcomePage wel = new WelcomePage(driver);
		//WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.visibilityOf(wel.getLoginButton()));
		Thread.sleep(5000);
		wel.getLoginButton().click();
		LoginPage log = new LoginPage(driver);
		WebElement user=log.getEmailTextField();
		ReadProperties property=new ReadProperties();
		String username=property.getDataFromProperty("username");
		user.sendKeys(username);
		WebElement password=log.getPasswordTextField();
		String pass=property.getDataFromProperty("password");
		password.sendKeys(pass);
		log.getLoginButton().click();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
		driver.quit();
	}
	
	@AfterMethod()
	public void logout()
	{
		
		HomePage home = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(home.getSettings_button()));
		home.getSettings_button().click();
		wait.until(ExpectedConditions.visibilityOf(home.getLogout_Button()));
		home.getLogout_Button().click();
		Reporter.log("webiste login successfully");
		
	}

	
	
	
}
