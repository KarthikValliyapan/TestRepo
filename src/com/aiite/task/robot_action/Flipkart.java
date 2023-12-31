package com.aiite.task.robot_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart  // pending
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			WebElement xmark = driver.findElement(By.xpath("//span[text() = '✕']"));
			xmark.click();
			WebElement loginButton = driver.findElement(By.xpath("//span [text() = 'Sign in']"));
			loginButton.click();
			WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			userName.sendKeys("9080656861");
			WebElement otpButton = driver.findElement(By.xpath("//button[text() = 'Request OTP']"));
			otpButton.click();
		}
}
