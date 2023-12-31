package com.aiite.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute
{
	public static void main(String[] args)
		{

			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			WebElement userName = driver.findElement(By.xpath("//input[@id = 'email']"));
			WebElement passWord = driver.findElement(By.xpath("//input[@id = 'pass']"));
			WebElement logIn = driver.findElement(By.xpath("//button [@name = 'login']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','karthik')", userName);
			js.executeScript("arguments[0].setAttribute('value','12345')", passWord);
			String usernameData = (String) js.executeScript("return arguments[0].getAttribute('value')", userName);
			String passwordData = (String) js.executeScript("return arguments[0].getAttribute('value')", passWord);
			System.out.println(usernameData);
			System.out.println(passwordData);
			js.executeScript("arguments[0].click()", logIn);
			driver.close();
		}
}
