package com.aiite.task.printext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\LatestLib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement userName = driver.findElement(By.xpath("//input[@id = 'email']"));
			WebElement passWord = driver.findElement(By.xpath("//input[@id = 'pass']"));
			userName.sendKeys("hello");
			passWord.sendKeys("12325");
			String user = userName.getAttribute("value");
			String pass = passWord.getAttribute("value");
			System.out.println(user);
			System.out.println(pass);
			driver.close();

		}
}
