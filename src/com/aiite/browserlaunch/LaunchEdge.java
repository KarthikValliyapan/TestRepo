package com.aiite.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge
{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.edge.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.get("https://infinity.icicibank.com/corp/Login.jsp");
			WebElement userName = driver.findElement(By.className("login-input type_UserPrincipal"));
			userName.sendKeys("hello");
			
		}
}
