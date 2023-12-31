package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com");
			WebElement userId = driver.findElement(By.id("email"));
			WebElement passWord = driver.findElement(By.id("pass"));
			WebElement logInButton = driver.findElement(By.name("login"));
			userId.sendKeys("hello");
			Thread.sleep(3000);
			passWord.sendKeys("12345");
			Thread.sleep(3000);
			logInButton.click();
			Thread.sleep(3000);
			
			driver.get("https://www.facebook.com");
			WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?"));
			Thread.sleep(5000);
			forgotPassword.click();
			Thread.sleep(10000);
			
			driver.get("https://www.facebook.com");
			WebElement createPage = driver.findElement(By.partialLinkText("Create a"));
			Thread.sleep(3000);
			createPage.click();
			Thread.sleep(3000);
			
			driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			WebElement forgotEmailId = driver.findElement(By.xpath("//input[@id= 'identify_email']"));
			Thread.sleep(3000);
			forgotEmailId.sendKeys("priya@gmail.com");
			Thread.sleep(3000);
			WebElement submitButtton = driver.findElement(By.xpath("//button [@type = 'submit']"));
			submitButtton.click();
			

		}
}
