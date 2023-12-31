package com.aiite.task.printext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignin
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			WebElement userId = driver.findElement(By.xpath("//input[@class ='_18u87m _3WuvDp']"));
			userId.sendKeys("karthik@gmail.com");
			System.out.println(userId.getAttribute("value"));
			driver.close();
		}
}
