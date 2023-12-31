package com.aiite.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			String pageTitle = driver.getTitle();
			System.out.println("\nThe page title is: "+pageTitle);
			String pageSource = driver.getPageSource();
			System.out.println("\nThe page source is: "+pageSource);
			driver.close();
		}
}
