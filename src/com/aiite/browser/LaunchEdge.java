package com.aiite.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.edge.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			String pageTitle1 = driver.getTitle();
			System.out.println("\nThe page title is: "+pageTitle1);
			String pageSource1 = driver.getPageSource();
			System.out.println("\nThe page source is: "+pageSource1);
			driver.close();
		}
}
