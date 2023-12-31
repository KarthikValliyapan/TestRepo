package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMouseHover
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/");
			Thread.sleep(2000);
			WebElement mobiles = driver.findElement(By.xpath("//span[text() = 'Mobile & Accessories']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(mobiles).perform();
			Thread.sleep(2000);
			WebElement caseCovers = driver.findElement(By.xpath("//span[text() = 'Mobile Cases & Covers']"));
			caseCovers.click();
			Thread.sleep(2000);
			driver.close();
			
		}
}
