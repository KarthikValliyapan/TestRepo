package com.aiite.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/index.htm");
			Thread.sleep(3000);
			WebElement scrolldownEndPoint = driver.findElement(By.xpath("//h5[text() = 'ABOUT US']"));
			WebElement scrollupStartPoint = driver.findElement(By.xpath("//input [@id = 'search-strings']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", scrolldownEndPoint);
			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView(false);", scrollupStartPoint);
			Thread.sleep(3000);
			driver.close();
		}
}
