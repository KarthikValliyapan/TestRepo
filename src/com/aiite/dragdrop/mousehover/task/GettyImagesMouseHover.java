package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyImagesMouseHover
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gettyimages.in/");
		Thread.sleep(2000);
		WebElement enterprise = driver.findElement(By.xpath("//a[text() = 'ENTERPRISE']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(enterprise).perform();
		Thread.sleep(2000);
		WebElement mediaManager = driver.findElement(By.xpath("//span[text() = 'More about Media Manager']"));
		mediaManager.click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}
