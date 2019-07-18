package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement f = driver.findElement(By.name("firstname"));
		  f.sendKeys("Akshaya");
		  
		WebElement l = driver.findElement(By.name("lastname"));
		  l.sendKeys("Sivasubramanian");
		  
		WebElement btnr = driver.findElement(By.xpath("//input[@value='Male']"));
		   btnr.click();
		   
		WebElement btnr1 = driver.findElement(By.xpath("//input[@value='1']"));
		   btnr1.click();
		   
	    WebElement d = driver.findElement(By.id("datepicker"));
			  d.sendKeys("20-06-2019");
			  
	    WebElement btns1 = driver.findElement(By.xpath("//button[@id='submit']"));
			   btns1.click();
			   
	      
		

	}

}
