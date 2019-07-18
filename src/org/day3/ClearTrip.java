package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtU = driver.findElement(By.id("from_station"));
        
		txtU.sendKeys("chennai Beach");
		
		WebElement txtp = driver.findElement(By.id("to_station"));
        
		txtp.sendKeys("trichi");
		
        WebElement btnlogin = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		
		btnlogin.click();
	}

}
