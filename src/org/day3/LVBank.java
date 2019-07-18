package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
 		WebDriver driver =new ChromeDriver();
 		 
 		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
 		
 		WebElement n = driver.findElement(By.id("navbar_username"));
		  n.sendKeys("Akshaya");
		  
		  WebElement p = driver.findElement(By.id("navbar_password"));
		    p.sendKeys("Niikkii@23456");
		    
		    WebElement btnc = driver.findElement(By.xpath("//input[@id='cb_cookieuser_navbar']"));
			
			 btnc.click();
			 
			 WebElement btnlogin = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
				
			 btnlogin.click();
	}

}
