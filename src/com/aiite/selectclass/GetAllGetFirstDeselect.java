package com.aiite.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllGetFirstDeselect
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://only-testing-blog.blogspot.com/");
			WebElement country = driver.findElement(By.xpath("(//select [@name='FromLB'])[1]"));
			Select select = new Select(country);
			select.selectByVisibleText("India");
			select.selectByVisibleText("Germany");
			select.selectByVisibleText("Malaysia");
			WebElement firstCountry = select.getFirstSelectedOption();
			String s = firstCountry.getText();
			System.out.println(s);

			Thread.sleep(2000);
			List<WebElement> countryList = select.getAllSelectedOptions();
			for (WebElement data : countryList)
				{
					System.out.println(data.getText());
				}
			
			Thread.sleep(2000);
			select.deselectAll();
			
			Thread.sleep(2000);
			driver.close();
		}
}
