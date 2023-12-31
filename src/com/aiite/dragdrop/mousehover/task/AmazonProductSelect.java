package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProductSelect // sunglasses not working
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement all = driver.findElement(By.xpath("(//span [text() = 'All']) [2]"));
		all.click();
		Thread.sleep(2000);
		
		WebElement mensFashion = driver.findElement(By.xpath("//div [text() = \"Men's Fashion\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mensFashion).perform();
		actions.click().perform();
		Thread.sleep(2000);
		
		WebElement sunGlasses = driver.findElement(By.xpath("((//a [text() = 'Sunglasses'])[1]"));
		sunGlasses.click();
		Thread.sleep(2000);
		
	}
}
