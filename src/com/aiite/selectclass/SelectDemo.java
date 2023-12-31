package com.aiite.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select [@name = 'day']"));
		Select select = new Select(day);
		select.selectByValue("20");
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select [@id = 'month']"));
		select = new Select(month);
		select.selectByIndex(9);
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select [@name = 'year']"));
		select = new Select (year);
		select.selectByVisibleText("2005");

		WebElement submitButton = driver.findElement(By.xpath("//input [@name = 'Submit']"));
		submitButton.click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
