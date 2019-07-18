package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args)  {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshaya-PC\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
        
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		WebElement btncnct = driver.findElement(By.xpath("//a[@href='contact.php']"));
		   btncnct.click();
		   
		WebElement n = driver.findElement(By.name("name"));
		  n.sendKeys("Akshaya");
		   
        WebElement e= driver.findElement(By.name("email"));
          e.sendKeys("aksh@email.com");
          
        WebElement phno= driver.findElement(By.name("phone"));
          phno.sendKeys("9988776677");
          
        WebElement m= driver.findElement(By.name("comments"));
          m.sendKeys("Need an enquiry on Testing class");
          
          //Thread.sleep(3000);
          
        WebElement btns = driver.findElement(By.xpath("//input[@type='submit']"));
           btns.click();
	}

}
