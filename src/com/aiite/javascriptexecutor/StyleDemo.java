package com.aiite.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StyleDemo
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement userName = driver.findElement(By.xpath("//input[@id = 'email']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id = 'pass']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow ; border: solid 5px orange')", userName);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style','background: green ; border: solid 5px red')", passWord);
		Thread.sleep(3000);
		driver.close();
	}
}
