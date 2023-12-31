package com.aiite.xpath.radio.checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ironspider.ca/forms/checkradio.htm");
			for(int i = 1; i<=6; i++)
				{
					String path = "(//input [@type = 'checkbox'])" +"[" + i +"]";
					WebElement checkBox = driver.findElement(By.xpath(path));
					checkBox.click();
				}
			Thread.sleep(2000);
		}
}
