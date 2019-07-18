package org.day3;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedBus {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.redbus.in/");
		
		// To maximize the window   
		driver.manage().window().maximize();
		
		
		WebElement btns1 = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btns1.click();
		 
		 WebElement btns2 = driver.findElement(By.xpath("//li[@id='signInLink']"));
		   btns2.click();
		 

	}

}
