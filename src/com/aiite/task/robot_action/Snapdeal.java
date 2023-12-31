package com.aiite.task.robot_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal
{
	public static void main(String[] args) throws AWTException, InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/");
			
			WebElement product = driver.findElement(By.xpath("// div [@pog = '672311651336']"));
			Thread.sleep(2000);
			Actions actions = new Actions (driver);
			actions.contextClick(product).perform();
			Robot robot = new Robot();
			for (int i = 1; i <= 2; i++)
				{
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
				}
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.quit();
		}
}
