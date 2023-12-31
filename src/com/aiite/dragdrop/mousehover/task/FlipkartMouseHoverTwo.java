package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHoverTwo
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
			Thread.sleep(2000);

			WebElement fashion = driver.findElement(By.xpath("//span [text() = 'Fashion']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(fashion).perform();
			Thread.sleep(2000);

			WebElement womensFootwear = driver.findElement(By.xpath("//a[text() = 'Women Footwear']"));
			actions.moveToElement(womensFootwear).perform();
			Thread.sleep(2000);

			WebElement womensSlippers = driver.findElement(By.xpath("//a [text() = 'Women Slipper Flip Flops']"));
			womensSlippers.click();
			Thread.sleep(2000);
			driver.close();
		}
}
