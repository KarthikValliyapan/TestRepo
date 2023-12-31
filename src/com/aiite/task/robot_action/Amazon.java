package com.aiite.task.robot_action;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException, AWTException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			
			WebElement helloSignin = driver.findElement(By.xpath("//span [text() = 'Hello, sign in']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(helloSignin).perform();
			
			Thread.sleep(2000);
			WebElement signIn = driver.findElement(By.xpath("(//span [@class = 'nav-action-inner'])[1]"));
			signIn.click();
			
			WebElement userId = driver.findElement(By.xpath("//input [@id = 'ap_email']"));
			userId.sendKeys("9080656861");
			
			actions.click(userId).perform();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			
			WebElement continueButton = driver.findElement(By.xpath("//input [@id = 'continue']"));
			continueButton.click();
			
			WebElement password = driver.findElement(By.xpath("//input [@id = 'ap_password']"));
			actions.click(password).perform();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			WebElement checkBox = driver.findElement(By.xpath("//input [@type = 'checkbox']"));
			checkBox.click();
			Thread.sleep(3000);
			driver.close();
		}
}
