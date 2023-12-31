package com.aiite.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			String pageTitle1 = driver.getTitle();
			System.out.println("\nThe page title is: "+pageTitle1);
			String pageSource1 = driver.getPageSource();
			System.out.println("\nThe page source is: "+pageSource1);
			driver.close();
		}
}
