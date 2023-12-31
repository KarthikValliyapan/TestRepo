package com.aiite.xpath.radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabledSelected
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement male = driver.findElement(By.xpath("//input [@value = 'Male']"));
		Thread.sleep(2000);		
		System.out.println("Male Radio Button is Displayed? " +male.isDisplayed());
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		System.out.println("Submit button is enabled? " + submit.isEnabled());
		
		System.out.println("Before click in Male radio: is selected: " +male.isSelected());
		male.click();
		System.out.println("After click in Male radio: is selected: " +male.isSelected());

	}
}
