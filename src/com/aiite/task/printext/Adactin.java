package com.aiite.task.printext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\LatestLib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://adactinhotelapp.com/");
			WebElement userName = driver.findElement(By.xpath("//input[@id = 'username']"));
			WebElement passWord = driver.findElement(By.xpath("//input[@id = 'password']"));
			userName.sendKeys("user");
			passWord.sendKeys("12345");
			String user = userName.getAttribute("value");
			String pass = passWord.getAttribute("value");
			System.out.println(user);
			System.out.println(pass);
			driver.close();
		}
}
