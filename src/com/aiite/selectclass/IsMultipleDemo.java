package com.aiite.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDemo
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
			WebElement day = driver.findElement(By.xpath("//select [@name = 'day']"));
			Select select = new Select(day);
			boolean result = select.isMultiple();
			System.out.println(result);

			driver.get("https://only-testing-blog.blogspot.com/");
			WebElement country = driver.findElement(By.xpath("(//select [@name='FromLB'])[1]"));
			select = new Select(country);
			result = select.isMultiple();
			System.out.println(result);

			driver.close();
		}
}
