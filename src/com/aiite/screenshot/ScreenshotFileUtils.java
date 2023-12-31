package com.aiite.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotFileUtils
{
	public static void main(String[] args) throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://only-testing-blog.blogspot.com/");
			TakesScreenshot tkScreenshot = (TakesScreenshot) driver;
			File source = tkScreenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\SeleniumTask\\Seleniumtask\\Screenshots\\one.jpeg");
			FileUtils.copyFile(source, destination);
			driver.close();
		}
}
