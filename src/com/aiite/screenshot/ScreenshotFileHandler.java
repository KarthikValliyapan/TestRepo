package com.aiite.screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotFileHandler
{
	public static void main(String[] args) throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			TakesScreenshot tkScreenshot = (TakesScreenshot) driver;
			File source = tkScreenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\SeleniumTask\\Seleniumtask\\Screenshots\\two.jpeg");
			FileHandler.copy(source, destination);
			driver.close();
		}
}