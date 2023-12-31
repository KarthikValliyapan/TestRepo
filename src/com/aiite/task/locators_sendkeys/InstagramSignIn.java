package com.aiite.task.locators_sendkeys;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignIn
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement userId = driver.findElement(By.xpath("//input [@name = 'username']"));
			WebElement passWord = driver.findElement(By.xpath("//input [@name = 'password']"));
			WebElement logInButton = driver.findElement(By.xpath("//button [@type = 'submit']"));
			Thread.sleep(1000);
			userId.sendKeys("hello");
			Thread.sleep(1000);
			passWord.sendKeys("122356");
			Thread.sleep(1000);
			logInButton.click();
			driver.close();
		}
}
