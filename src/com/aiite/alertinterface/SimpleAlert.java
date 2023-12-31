package com.aiite.alertinterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01jksij9xij5ercgp4e9fldeiw498669.node0");
			WebElement simpleAlert = driver.findElement(By.xpath("(//span[text() = 'Show'])[1]"));
			Thread.sleep(3000);
			simpleAlert.click();
			
			Alert msgbox = driver.switchTo().alert();
			Thread.sleep(3000);
			msgbox.accept();
			
			Thread.sleep(3000);	
			driver.close();
			
		}
}
