package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea [@title = 'Search']"));
		Thread.sleep(2000);
		search.sendKeys("Facebook");
		Thread.sleep(2000);
		driver.close();
	}
}
