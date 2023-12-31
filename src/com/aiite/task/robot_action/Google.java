package com.aiite.task.robot_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement appsButton = driver.findElement(By.xpath("(//a[@role = 'button'])[1]"));
		appsButton.click();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("(//iframe [@role = 'presentation'])[2]"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		WebElement gmailApp = driver.findElement(By.xpath("//span[text()='Gmail']"));
		gmailApp.click();
		Thread.sleep(2000);
		driver.quit();

//		Actions actions = new Actions(driver);
//		WebElement appsButton = driver.findElement(By.xpath("(//a[@role = 'button'])[1]"));
//		actions.click(appsButton).perform();
//		Thread.sleep(2000);
//		WebElement frameElement = driver.findElement(By.xpath("(//iframe [@role = 'presentation'])[2]"));
//		driver.switchTo().frame(frameElement);
//		Thread.sleep(2000);
//		WebElement gmailApp = driver.findElement(By.xpath("//span[text()='Gmail']"));
//		actions.moveToElement(gmailApp).perform();
//		Thread.sleep(2000);
//		actions.click().perform();
//		driver.quit();
		
	}
}
