package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.adactin.com/HotelApp/");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.id("username"));
		
		// to insert the value
		        txtUser.sendKeys("akshaya2014@gmail.com");
		        
		// To find the locator password
		        
		  WebElement txtPswrd = driver.findElement(By.id("password"));
		  
		  // to insert the value
		  
		       txtPswrd.sendKeys("Password");

	}

}
