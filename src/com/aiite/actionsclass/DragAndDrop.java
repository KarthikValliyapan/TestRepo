package com.aiite.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01sufycwr511k111afemn9uxi2r498614.node0");
		WebElement source = driver.findElement(By.xpath("//p [text() = 'Drag to target']"));
		WebElement target = driver.findElement(By.xpath("//span [text() = 'Droppable Target']"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(source, target).perform();
		//action.dragAndDropBy(source, 56, 34).perform();
		Thread.sleep(3000);
		driver.close();
	}
}
