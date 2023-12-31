package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMouseHoverTwo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/");
			Thread.sleep(2000);
			
			WebElement womensFashion = driver.findElement(By.xpath("(//span [@class = 'catText'])[2]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(womensFashion).perform();
			Thread.sleep(2000);

			WebElement footWear = driver.findElement(By.xpath("(//span [text() = 'Footwear'])[2]"));
			footWear.click();
			Thread.sleep(2000);

			WebElement heelsForWomen = driver.findElement(By.xpath("//div[text() = 'Heels for Women']"));
			heelsForWomen.click();
			Thread.sleep(2000);

			driver.close();
		}
}
