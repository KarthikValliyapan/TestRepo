package com.aiite.alertinterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01jksij9xij5ercgp4e9fldeiw498669.node0");
			WebElement confirmAlert = driver.findElement(By.xpath("(//span[text() = 'Show'])[2]"));
			Thread.sleep(3000);
			confirmAlert.click();
			
			Alert msgbox = driver.switchTo().alert();
			Thread.sleep(3000);
			msgbox.dismiss();
			Thread.sleep(3000);	
			driver.close();
		}
}