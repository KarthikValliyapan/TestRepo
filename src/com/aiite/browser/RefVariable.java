package com.aiite.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefVariable
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
}
