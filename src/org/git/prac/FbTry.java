package org.git.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTry {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.facebook.com");
		
		WebElement txtUser = driver.findElement(By.id("email"));
	     txtUser.sendKeys("JAVA");
	    WebElement txtPswrd = driver.findElement(By.id("pass"));
	    txtPswrd.sendKeys("Password"); 
	}


}
