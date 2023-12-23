package shoppersstack.obbjectrepository;

import org.openqa.selenium.WebDriver;

import shoppersstack.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileButton extends BasePage {


		public ProfileButton (WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="//ul[contains(@class,'MuiList-root')]/li[1]")
		private WebElement  myprofile;

		public WebElement getMyprofile() {
			return myprofile;
		}
		
		
}
