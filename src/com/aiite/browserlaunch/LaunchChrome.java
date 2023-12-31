package com.aiite.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.get("http://gmail.com/");
			WebDriver driver2 = new ChromeDriver();
			driver2.get("http://www.flipkart.com/");
			
		}
}
