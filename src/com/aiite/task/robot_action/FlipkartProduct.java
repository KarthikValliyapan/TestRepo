package com.aiite.task.robot_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProduct
{
	public static void main(String[] args) throws AWTException, InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			WebElement xmark = driver.findElement(By.xpath("//span[text() = '✕']"));
			xmark.click();
			Thread.sleep(3000);
			WebElement helmet = driver.findElement(By.xpath("//div [text() = 'Rider Helmets']"));
			Actions actions = new Actions(driver);
			actions.contextClick(helmet).perform();
			Robot robot = new Robot();
			for (int i = 1; i <= 2; i++)
				{
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(3000);
				}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			driver.quit();
		}
}
