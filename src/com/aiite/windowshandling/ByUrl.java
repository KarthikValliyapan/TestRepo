package com.aiite.windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUrl
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1697039597&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
		WebElement productOne = driver.findElement(By.xpath("(//span [@class = 'a-size-base-plus a-color-base a-text-normal'])[1]"));
		productOne.click();
		String parenturl = driver.getCurrentUrl();
		System.out.println(parenturl);
		
		
	}
}
