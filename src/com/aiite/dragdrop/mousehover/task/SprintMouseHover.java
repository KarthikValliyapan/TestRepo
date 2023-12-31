package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintMouseHover
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Actions actions = new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://www.sprint.com/en/");
			Thread.sleep(2000);

			WebElement plans = driver.findElement(By.xpath("//span [text() = 'Plans']"));
			actions.moveToElement(plans).perform();
			Thread.sleep(2000);

			WebElement unlimitedPlan = driver.findElement(By.xpath("//a[text() = 'Unlimited plans']"));
			unlimitedPlan.click();
			Thread.sleep(2000);
			driver.close();
			
		}
}
