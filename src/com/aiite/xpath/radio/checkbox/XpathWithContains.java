package com.aiite.xpath.radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithContains
{
public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement pageContent = driver.findElement(By.xpath("//h2 [contains(text(),'helps you')]"));
		String s = pageContent.getText();
		System.out.println(s);
	}
}
