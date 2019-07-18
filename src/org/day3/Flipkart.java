package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.flipkart.com/");
		
		WebElement txtu = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		  txtu.sendKeys("9988776655");
         
		WebElement txtp = driver.findElement(By.xpath("//input[@type='password']"));
		  txtp.sendKeys("Nikki@2906");
		   
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			
		 btnlogin.click();
	}

}
