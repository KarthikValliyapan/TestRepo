package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciLogIn  // pending output
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement userId = driver.findElement(By.xpath("//input[@title='User Id']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@title= 'Password']"));
		Thread.sleep(1000);
		userId.click();
		Thread.sleep(1000);
		userId.sendKeys("hello");
		Thread.sleep(1000);
		passWord.sendKeys("12233");
		Thread.sleep(1000);
		driver.close();
	}
}
