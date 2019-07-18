package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraReg {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
         
 		WebDriver driver =new ChromeDriver();
 		 
 		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
 		
 		WebElement n = driver.findElement(By.name("email"));
		  n.sendKeys("Akshaya");
		
		WebElement p = driver.findElement(By.name("password"));
		  p.sendKeys("vic1234!");
		  
		WebElement m = driver.findElement(By.name("mobile"));
		  m.sendKeys("9900887766");
	}
}
