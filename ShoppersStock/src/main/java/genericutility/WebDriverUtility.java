package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void clickOnElement(WebElement element) {
		element.click();
		
	}
	
	public String getPageTitle(WebDriver driver) {
		String title =driver.getTitle();
		return title;
		
	}
	
		public String getPageUrl(WebDriver driver){
		
		
			String url = driver.getCurrentUrl();
			return url;
			
		}
		
		public void selectDropdownByIndex(WebElement dropdown , int Index){
		
			Select sel = new Select(dropdown);
			sel.selectByIndex(Index);	
		}
		
public void selectDropdownbyText(WebElement dropdown1 , String Text){
		
			Select sel = new Select(dropdown1);
			sel.selectByVisibleText(Text);
		}
public void selectDropdownbyValue(WebElement dropdown2 , String value1){


	Select sel = new Select(dropdown2);
	sel.selectByValue(value1);
}
public void deselectIndex(WebElement dropdown3  , int Index1) {

	Select sel = new Select (dropdown3);
	sel.deselectByIndex(Index1);
}     
public void deselectIn(WebElement dropdown3  , String value2) {

	Select sel = new Select (dropdown3);
	sel.deselectByValue(value2);
}     

public void deselectDropdownbyText(WebElement dropdown5 , String Text1){
	
	Select sel = new Select(dropdown5);
	sel.deselectByVisibleText(Text1);
}
public String getTextFromWebElement(WebElement element) {
  String text1 = element.getText();
return text1;
}
 public void sendText(WebElement element) {
	 CharSequence text1 = null;
	element.sendKeys(text1);
	 
 }
 
 public void alert(WebDriver driver) {
  driver.switchTo().alert().accept();
		}
 
 public void alert1(WebDriver driver) {
	 driver.switchTo().alert().dismiss();
 }
 
 public void dragandDropElement(WebDriver driver , WebElement element1 , WebElement element2) {
 
 Actions act = new Actions(driver);
 act.dragAndDrop(element1, element2).perform();
 }           
 public void rightClick(WebDriver driver , WebElement element) { 
 Actions act = new Actions(driver);
 act.contextClick().perform();
 
 } 
 public void doubleClickElement(WebDriver driver , WebElement element) {
	 
 Actions act = new Actions(driver);
 act.doubleClick().perform();
 }
 
 public void scrollToElement(WebDriver driver , WebElement element) {
	 JavascriptExecutor jse= (JavascriptExecutor) driver;
	 jse.executeScript("aruguments[0].scrollIntoView(true);" , element);
 } 
 
 public void switchToFrameByWebELement (WebDriver driver , WebElement element) {
	 driver.switchTo().frame(element);
 }
 
 public  String getAttribute(WebElement element , String attributename) {
	 String value= element.getAttribute(attributename);
	 return value;
 }
}
 

