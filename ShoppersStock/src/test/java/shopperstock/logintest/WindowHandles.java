package shopperstock.logintest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class WindowHandles {
	@Test
	public void demoTest(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String homehandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();           
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for (String handle:allhandles) {
			if(!(handle.equals(homehandle))) {
				
				driver.switchTo().window(handle);
				String title = driver.getTitle();
				if (title.contains("Google")){
					System.out.println(title);
					
				}
			else {
				driver.close();
				
			}
		}
			
		
	}
		driver.switchTo().window(homehandle);
		driver.close();
}
}
