package com.aiite.task.locators_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusFromAndTo
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.xpath("//input [@id = 'src']"));
		WebElement to = driver.findElement(By.xpath("//input [@id = 'dest']"));
		Thread.sleep(2000);
		from.sendKeys("chennai");
		Thread.sleep(2000);
		to.sendKeys("trichy");
	}
}
