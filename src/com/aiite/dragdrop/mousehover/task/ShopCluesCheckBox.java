package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopCluesCheckBox
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//	Actions actions = new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://www.shopclues.com/smartphone-sales.html?");

			WebElement priceRangeCheckBox = driver.findElement(By.xpath("(//input [@type = 'checkbox'])[6]"));
			priceRangeCheckBox.click();
			
		}
}
