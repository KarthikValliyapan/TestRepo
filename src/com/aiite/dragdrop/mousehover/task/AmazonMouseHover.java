package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			WebElement mobiles = driver.findElement(By.xpath("//a [text() = 'Mobiles']"));
			mobiles.click();
			WebElement mobilesAndAcc = driver.findElement(By.xpath("(//span [@class = 'nav-a-content'])[2]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(mobilesAndAcc).perform();
			Thread.sleep(3000);
			WebElement powerBanks = driver.findElement(By.xpath("//a[text() = 'Power Banks']"));
			powerBanks.click();
			Thread.sleep(3000);
			driver.close();
			
		}
}
