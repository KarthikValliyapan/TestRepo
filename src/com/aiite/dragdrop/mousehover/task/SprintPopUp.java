package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintPopUp
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.sprint.com/");
			
			WebElement popUp = driver.findElement(By.xpath("//a [text() = 'Continue to Sprint']"));
			popUp.click();
			
		}
}
