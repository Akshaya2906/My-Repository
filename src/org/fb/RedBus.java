package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.redbus.in/");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.id("src"));
		
		// to insert the value
		        txtUser.sendKeys("Chennai");
		        
		// To find the locator password
		        
		  WebElement txtPswrd = driver.findElement(By.id("dest"));
		  
		  // to insert the value
		  
		       txtPswrd.sendKeys("Mumbai");

	}

}
