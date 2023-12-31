package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:\\www.facebook.com");
		Thread.sleep(2000);
		WebElement createPage = driver.findElement(By.partialLinkText("Create a"));
		createPage.click();
		
		driver.get("https:\\www.facebook.com");
		Thread.sleep(2000);
		WebElement createAccount = driver.findElement(By.partialLinkText("Log i")); // partial link text works for button also
		createAccount.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
