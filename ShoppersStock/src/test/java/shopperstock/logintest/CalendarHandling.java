package shopperstock.logintest;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalendarHandling {

	@Test
public void calendar(){
	

	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();

	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	boolean res = true;
	while(res) {
		String monthText=driver.findElement(By.xpath("//div[@class= 'ui-datepicker-title']")).getText();
		if(monthText.contains("August 2000")) {
			driver.findElement(By.xpath("//a[text()='15']")).click();
			res=false;
		}
		else 
		{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
		
			
	}
	}}}

