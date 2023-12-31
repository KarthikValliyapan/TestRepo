package com.aiite.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			Thread.sleep(3000);
			WebElement kids = driver.findElement(By.xpath("(//a [text() = 'Kids'])[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(kids).perform();
			Thread.sleep(2000);
			WebElement kidstrousers = driver.findElement(By.xpath("//a[text() = 'Trousers']"));
			kidstrousers.click();
			Thread.sleep(3000);
			driver.close();
		}
}
