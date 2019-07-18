package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/login");
		

		
		//To find the locator 
		WebElement txt = driver.findElement(By.xpath("(//div[@class='clearfix field']//input)[1]"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAtribute('value','Farith')",txt);
		// to insert value
	//	txt.sendKeys("akshaya");
		
		//To find the locator 
//		WebElement txtPswrd = driver.findElement(By.name("session[password]"));
//				
//		// to insert value
//		txtPswrd.sendKeys("Welcome123");

	}

}
