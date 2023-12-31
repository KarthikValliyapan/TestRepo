package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseHover
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
			WebElement homeFurniture = driver.findElement(By.xpath("//span[text() = 'Home & Furniture']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(homeFurniture).perform();
			Thread.sleep(2000);
			WebElement bedroomFurniture = driver.findElement(By.xpath("//a[text() = 'Bedroom Furniture']"));
			actions.moveToElement(bedroomFurniture).perform();
			Thread.sleep(2000);
			WebElement officeChairs = driver.findElement(By.xpath("(//a[text() = 'Office Chairs'])[2]"));
			officeChairs.click();
			Thread.sleep(2000);
			driver.quit();

		}
}
