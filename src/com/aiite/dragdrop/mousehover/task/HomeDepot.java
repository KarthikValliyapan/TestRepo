package com.aiite.dragdrop.mousehover.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Actions actions = new Actions(driver);
			driver.get("https://www.homedepot.com/");
			Thread.sleep(4000);

//			WebElement logo = driver.findElement(By.xpath("//a [@data-testid='header-thd-logo']"));
//			logo.click();
//			Thread.sleep(2000);
			
			WebElement allDep = driver.findElement(By.xpath("//a[text() = 'All Departments']"));
			actions.moveToElement(allDep).perform();
			Thread.sleep(2000);
			WebElement heat = driver.findElement(By.xpath("//a[text() = 'Heating, Cooling & Air Quality']"));
			actions.moveToElement(heat).perform();
			Thread.sleep(2000);
			WebElement airCondition = driver.findElement(By.xpath("//a[text() = 'Air Conditioners']"));
			actions.moveToElement(airCondition).perform();
			Thread.sleep(3000);
			WebElement portableAir = driver.findElement(By.xpath("//a[text() = 'Portable Air Conditioners']"));
			portableAir.click();
			Thread.sleep(2000);
			driver.close();
		}
}
