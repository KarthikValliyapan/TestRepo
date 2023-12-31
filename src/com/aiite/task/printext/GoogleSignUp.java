package com.aiite.task.printext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignUp
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/signup/v2/createaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp&theme=glif");
			WebElement firstName = driver.findElement(By.xpath("//input [@id = 'firstName']"));
			WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
			firstName.sendKeys("karthik");
			lastName.sendKeys("valiyappan");
			System.out.println(firstName.getAttribute("value"));
			System.out.println(lastName.getAttribute("value"));
			driver.close();
		}
}
