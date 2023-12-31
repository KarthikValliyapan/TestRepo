package com.aiite.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
			
			WebElement day = driver.findElement(By.xpath("//select [@name = 'day']"));
			WebElement month = driver.findElement(By.xpath("//select [@id = 'month']"));
			WebElement year = driver.findElement(By.xpath("//select [@name = 'year']"));

			Select select  = new Select(day);
			List<WebElement> dayList = select.getOptions();
			for (int i = 0; i <dayList.size(); i ++)
				{
					System.out.println(dayList.get(i).getText());
				}
			
			select  = new Select(month);
			List<WebElement> monthList = select.getOptions();
			for (int i = 0; i <monthList.size(); i ++)
				{
					System.out.println(monthList.get(i).getText());
				}
			
			select  = new Select(year);
			List<WebElement> yearList = select.getOptions();
			for (int i = 0; i <yearList.size(); i ++)
				{
					System.out.println(yearList.get(i).getText());
				}
			
			driver.close();
		}
}
