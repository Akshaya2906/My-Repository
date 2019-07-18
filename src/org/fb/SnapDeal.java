package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.snapdeal.com/login");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.id("userName"));
		
		// to insert the value
		        txtUser.sendKeys("akshaya239476@gmail.com");

	}

}
