package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogIn
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement userName = driver.findElement(By.id("email"));
			WebElement passWord = driver.findElement(By.id("pass"));
			WebElement loginButton = driver.findElement(By.name("login"));
			userName.sendKeys("karthik");
			passWord.sendKeys("1245");
			loginButton.click();
		}
}
