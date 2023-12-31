package com.aiite.task.printext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTabs
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//span[text() = '✕']")).click();
			System.out.println( driver.findElement(By.xpath("//span[text() = 'Grocery']")).getText());
			System.out.println( driver.findElement(By.xpath("//span[text() = 'Mobiles']")).getText());
			System.out.println( driver.findElement(By.xpath("//span[text() = 'Fashion']")).getText());
			System.out.println( driver.findElement(By.xpath("//span[text() = 'Home & Furniture']")).getText());
			driver.close();
		}
}