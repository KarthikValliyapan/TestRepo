package com.aiite.windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ById
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1697039597&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
			WebElement productOne = driver.findElement(By.xpath("(//span [@class = 'a-size-base-plus a-color-base a-text-normal'])[1]"));
			productOne.click();

			String parentWindowId = driver.getWindowHandle();
			System.out.println(parentWindowId);
			
			Set<String> set = driver.getWindowHandles();
			List<String> list = new ArrayList<>(set);
			String childWindowIdOne = list.get(1);
			System.out.println(childWindowIdOne);
			driver.switchTo().window(childWindowIdOne);
			
			WebElement addToCart = driver.findElement(By.xpath("//input [@id = 'add-to-cart-button']"));
			addToCart.click();
			Thread.sleep(2000);
			
			set = driver.getWindowHandles();
			list = new ArrayList<>(set);
			String childWindowIdTwo = list.get(1);
			System.out.println(childWindowIdTwo);
			driver.switchTo().window(childWindowIdTwo);
			Thread.sleep(2000);

			WebElement cartButton = driver.findElement(By.xpath("//span[@id = 'attach-sidesheet-view-cart-button']"));
			cartButton.click();
			Thread.sleep(2000);
			
			WebElement price =  driver.findElement(By.xpath("(//span[text() = '19,999.00'])[1]"));
			System.out.println(price.getText());
			Thread.sleep(2000);
			driver.quit();
		}
}
