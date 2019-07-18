package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.irctc.co.in/");
		
		//To find the locator of username
		
		WebElement txtUser = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		// to insert the value
		        txtUser.sendKeys("MGR CHENNAI CTL");
		        
		// To find the locator password
		        
		  WebElement txtPswrd = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		  
		  // to insert the value
		  
		       txtPswrd.sendKeys("KSR BENGALURU");
		       
	}

}
