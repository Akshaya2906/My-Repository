package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	
	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://netbanking.hdfcbank.com/");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
		
		// to insert the value
		        txtUser.sendKeys("12345Hdfc");
		 
	}

}
