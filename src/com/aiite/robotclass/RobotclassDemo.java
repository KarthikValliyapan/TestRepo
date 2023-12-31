package com.aiite.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotclassDemo
{
	public static void main(String[] args) throws InterruptedException, AWTException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			WebElement gmailLink = driver.findElement(By.xpath("//a[text() = 'Gmail']"));
			Actions actions = new Actions(driver);
			actions.contextClick(gmailLink).perform();
			Robot robot = new Robot();
			for (int i = 1; i <= 3; i++)
				{
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
				}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(6000);
			driver.quit();
		}
}
