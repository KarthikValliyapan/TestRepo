package com.aiite.xpath.radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioBox
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement male = driver.findElement(By.xpath("//input [@value = 'Male']"));
		WebElement female = driver.findElement(By.xpath("(//input [@type = 'radio'])[2]"));
		Thread.sleep(2000);
		male.click();
		Thread.sleep(2000);
		female.click();
		Thread.sleep(2000);

		WebElement cricket = driver.findElement(By.xpath("//input [@value = 'Cricket']"));
		WebElement movies = driver.findElement(By.xpath("//input [@value = 'Movies']"));
		WebElement hockey = driver.findElement(By.xpath("(//input [@type = 'checkbox']) [3]"));
		
		Thread.sleep(2000);
		cricket.click();
		Thread.sleep(2000);
		movies.click();
		Thread.sleep(2000);
		hockey.click();
		Thread.sleep(2000);
		driver.close();
	}
}
