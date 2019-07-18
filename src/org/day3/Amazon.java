package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		
		//Mouseover 
		Actions a = new Actions(driver);
		
        WebElement btns = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']"));
        
        //MouseOver
		a.moveToElement(btns).perform();
		
       WebElement btns1 = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		   btns1.click();
		
	    WebElement btnc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
			btnc.click();
			
	     WebElement txtU = driver.findElement(By.id("ap_customer_name"));
	            txtU.sendKeys("Sandy");
			
	    WebElement txtph = driver.findElement(By.id("ap_phone_number"));
			
			txtph.sendKeys("9988776655");
			
	    WebElement txtPswrd = driver.findElement(By.id("ap_password"));
			
			txtPswrd.sendKeys("Nksuvk@1234");
			
	    //WebElement btnlogin = driver.findElement(By.xpath("//input[@id='continue']"));
			
			//btnlogin.click();

	}

}
