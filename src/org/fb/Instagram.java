package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));		
		// to insert the value
		        txtUser.sendKeys("akshay");
		        
		// To find the locator password
		        
		  WebElement txtPswrd = driver.findElement(By.name("password"));
		  
		  // to insert the value
		  
		       txtPswrd.sendKeys("hankdam");

	}

}
