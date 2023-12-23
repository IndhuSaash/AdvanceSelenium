package shoppersstack.obbjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//button[contains(@aria-label , 'Account settings')]")
			
			
			private WebElement Settings_button;
	

	public WebElement getSettings_button() {
		return Settings_button;
	}


	

	@FindBy(xpath="//ul[contains(@class,'MuiList-root MuiList')]/li[7]")
	private WebElement Logout_Button;
	

	public WebElement getLogout_Button() {
		return Logout_Button;
	}
	
	
	@FindBy(id="category")
	
	 private WebElement Product_Search;


	public WebElement getProduct_Search() {
		return Product_Search;
	}
	 
	
	
	
	 }



	
