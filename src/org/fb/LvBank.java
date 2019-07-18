package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvBank {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		//to find the locator user
		
		WebElement txtUser = driver.findElement(By.id("login_username|input"));
		
		txtUser.sendKeys("Akshaya");
		
		//to find locator pswrd
		
		WebElement txtPswrd = driver.findElement(By.name("password"));
		
		txtPswrd.sendKeys("Nikki@2906");
	}

}
