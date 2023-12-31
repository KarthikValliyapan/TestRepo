package com.aiite.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://only-testing-blog.blogspot.com/");
			WebElement country = driver.findElement(By.xpath("(//select [@name='FromLB'])[1]"));
			Select select = new Select(country);
			Thread.sleep(3000);

			select.selectByValue("USA");
			select.selectByIndex(1);
			select.selectByVisibleText("Japan");
			Thread.sleep(3000);

			select.deselectByValue("USA");
			Thread.sleep(3000);
			select.deselectByIndex(1);
			Thread.sleep(3000);
			select.deselectByVisibleText("Japan");
			Thread.sleep(3000);
			driver.close();
			
		}
}
