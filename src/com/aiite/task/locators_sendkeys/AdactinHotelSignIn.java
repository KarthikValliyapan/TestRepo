package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelSignIn
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://adactinhotelapp.com/");
			Thread.sleep(2000);
			WebElement userId = driver.findElement(By.name("username"));
			userId.sendKeys("hello");
			Thread.sleep(2000);
			WebElement passWord = driver.findElement(By.name("password"));
			passWord.sendKeys("12345");
			Thread.sleep(2000);
			WebElement logIn = driver.findElement(By.name("login"));
			logIn.click();
			Thread.sleep(2000);
			driver.close();

		}
}
