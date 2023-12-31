package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopCluesMouseHover // pricerange selection pending
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Actions actions = new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://www.shopclues.com/");
			Thread.sleep(3000);

			WebElement popUpBox = driver.findElement(By.xpath("//button [text() = \"Don't Allow\"]"));
			popUpBox.click();
			
			WebElement mobilesAndMore = driver.findElement(By.xpath("//a[text() = 'Mobiles & More']"));
			actions.moveToElement(mobilesAndMore).perform();
			Thread.sleep(2000);

			WebElement smartPhones = driver.findElement(By.xpath("//strong [text() = 'Smartphones & Tablets']"));
			smartPhones.click();
			Thread.sleep(2000);
		}
}
