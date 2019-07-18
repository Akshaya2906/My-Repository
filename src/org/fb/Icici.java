package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		
		// to insert the value
		        txtUser.sendKeys("akshu");
		        
		// To find the locator password
		        
		  WebElement txtPswrd = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		  
		  // to insert the value
		  
		       txtPswrd.sendKeys("Nikkh");

	}

}
