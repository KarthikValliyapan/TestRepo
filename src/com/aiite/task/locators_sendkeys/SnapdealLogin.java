package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealLogin
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/login");
			WebElement userId = driver.findElement(By.xpath("//input [@id = 'userName']"));
			Thread.sleep(2000);
			userId.sendKeys("9176468021");
			Thread.sleep(2000);
			WebElement loginButton = driver.findElement(By.id("checkUser"));
			loginButton.click();
			Thread.sleep(2000);
			driver.close();
		}
}
