package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCts {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		WebElement btncts = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		 btncts.click();
	}

}
