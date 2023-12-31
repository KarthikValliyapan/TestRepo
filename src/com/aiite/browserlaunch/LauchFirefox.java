package com.aiite.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchFirefox
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			String facebook = "https://www.facebook.com/";
			driver.get(facebook);
			
			WebDriver driver1 = new FirefoxDriver();
			String amazon = "https://www.amazon.in";
			driver1.get(amazon);
		}
}
