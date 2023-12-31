package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			WebElement username = driver.findElement(By.xpath("//input[@id = 'email']"));
			WebElement password = driver.findElement(By.xpath("//input[@id = 'pass']"));
			username.sendKeys("hello");
			password.sendKeys("12345");
			String user = username.getAttribute("value");
			String pass = password.getAttribute("value");
			System.out.println(user);
			System.out.println(pass);
			driver.close();
		}
}
