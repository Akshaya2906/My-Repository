package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAcc {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement n = driver.findElement(By.id("firstName"));
		  n.sendKeys("Akshaya");
		  
		WebElement l = driver.findElement(By.id("lastName"));
		  l.sendKeys("Sivasubramanian");
		  
		WebElement u = driver.findElement(By.id("username"));
		  u.sendKeys("akshu2019@gmail.com");
		  
		WebElement p = driver.findElement(By.name("Passwd"));
		  p.sendKeys("akshu1234");
		  
		WebElement cp = driver.findElement(By.name("ConfirmPasswd"));
		  cp.sendKeys("akshu1234");

	}

}
