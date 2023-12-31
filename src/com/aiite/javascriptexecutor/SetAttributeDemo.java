package com.aiite.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetAttributeDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement userName = driver.findElement(By.xpath("//input[@id = 'email']"));
			WebElement passWord = driver.findElement(By.xpath("//input[@id = 'pass']"));
			WebElement logIn = driver.findElement(By.xpath("//button [@name = 'login']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','test1')", userName);
			js.executeScript("arguments[0].setAttribute('value', '1234')", passWord);
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()", logIn);
			Thread.sleep(5000);
			driver.close();
		}
}
