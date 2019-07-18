package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealReg {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.snapdeal.com/");
		
		Actions a = new Actions(driver);
		
		WebElement btns = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		a.moveToElement(btns).perform();
		
		WebElement btnlogin = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		 btnlogin.click();
		 
		 /*Thread.sleep(3000);
		 
		 WebElement txtu = driver.findElement(By.xpath("//input[@name='username']"));
		  txtu.sendKeys("9988776655");*/

	}

}
