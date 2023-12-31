package com.aiite.dragdrop.mousehover.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepotTwo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.homedepot.com/");
			Thread.sleep(2000);
//			WebElement logo = driver.findElement(By.xpath("//a [@data-testid='header-thd-logo']"));
//			logo.click();
//			Thread.sleep(2000);
			
			WebElement allDep = driver.findElement(By.xpath("//a[text() = 'All Departments']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(allDep).perform();
			Thread.sleep(2000);
			WebElement paint = driver.findElement(By.xpath("//a[text() = 'Paint']"));
			actions.moveToElement(paint).perform();
			Thread.sleep(2000);
			WebElement interiorPaint = driver.findElement(By.xpath("//a[text() = 'Interior Paint']"));
			actions.moveToElement(interiorPaint).perform();
			Thread.sleep(2000);
			WebElement ceilingPaint = driver.findElement(By.xpath("//a [text() = 'Ceiling Paint']"));
			ceilingPaint.click();
			Thread.sleep(3000);
			driver.close();
		}
}
