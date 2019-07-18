package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignUp {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.swiggy.com/");
		
		WebElement btnlogin = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		
		 btnlogin.click();
		 
		 WebElement ph = driver.findElement(By.id("mobile"));
		  ph.sendKeys("9988776655");
		  
		  WebElement n = driver.findElement(By.id("name"));
		  n.sendKeys("Akshaya");
		  
		  WebElement e = driver.findElement(By.id("email"));
		  e.sendKeys("akshu2019@gmail.com");
		  
		  WebElement p = driver.findElement(By.id("password"));
		    p.sendKeys("Niikkii@23456");
		    
		//WebElement btnc = driver.findElement(By.xpath("//a[@class='a-ayg']"));
			//btnc.click();
	}

}
