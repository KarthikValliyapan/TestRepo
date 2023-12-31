package com.aiite.task.printext;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class ShopClues
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\LatestLib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shopclues.com/search?q=watches&sc_z=&z=0&count=9&user_id=&user_segment=default");
			WebElement watchProduct = driver.findElement(By.xpath("(//h2[@class = ' mii '])[1]"));
			watchProduct.click();

			Set<String> windowIds = driver.getWindowHandles();
			for (String childId : windowIds)
				{
					driver.switchTo().window(childId);
				}
			
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("//button [@id = 'add_cart']"));
			addToCart.click();
			
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			WebElement cartLogo = driver.findElement(By.xpath("//a[@class = 'cart_ic']"));
			action.moveToElement(cartLogo).perform();

			WebElement thirdcart = driver.findElement(By.xpath("//a[text() = 'View Cart']"));
			thirdcart.click();

			windowIds = driver.getWindowHandles();
			for (String childId : windowIds)
				{
					driver.switchTo().window(childId);
				}

			System.out.println(driver.getCurrentUrl());
			WebElement total = driver.findElement(By.xpath("//p[@class ='total']"));
			System.out.println("The Cost is: "+ total.getText());

			driver.quit();
		}
}
