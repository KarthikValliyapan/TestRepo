package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignIn
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);

			WebElement signIn = driver.findElement(By.xpath("//span[text() = 'Hello, sign in']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(signIn).perform();
			Thread.sleep(2000);

			WebElement startHere = driver.findElement(By.linkText("Start here."));
			startHere.click();
			Thread.sleep(2000);
			
			WebElement newsignIn = driver.findElement(By.linkText("Sign in"));
			newsignIn.click();
			Thread.sleep(2000);
			
			WebElement mobileNo = driver.findElement(By.id("ap_email"));
			mobileNo.sendKeys("9176567091");
			Thread.sleep(2000);

			WebElement continueButton = driver.findElement(By.xpath("//input [@id = 'continue']"));
			continueButton.click();
			Thread.sleep(2000);
			
			driver.close();
		}
}
