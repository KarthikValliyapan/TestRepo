package com.aiite.dragdrop.mousehover.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(2000);
			
			WebElement sourceOne = driver.findElement(By.xpath("//a[text() = ' BANK ']"));
			WebElement sourceTwo = driver.findElement(By.xpath("//a[text() = ' 5000']"));
			WebElement destOne = driver.findElement(By.xpath("(//li [@class= 'placeholder'])[1]"));
			WebElement destTwo = driver.findElement(By.xpath("(//li [@class= 'placeholder'])[2]"));
			WebElement sourceThree = driver.findElement(By.xpath("//a [text() = ' SALES ']"));
			WebElement sourceFour = driver.findElement(By.xpath("//a [text() = ' 5000 ']"));
			WebElement destThree = driver.findElement(By.xpath("(//li [@class= 'placeholder'])[3]"));
			WebElement destFour = driver.findElement(By.xpath("(//li [@class= 'placeholder'])[4]"));
			
			Actions actions = new Actions(driver);
			actions.dragAndDrop(sourceOne, destOne).perform();
			actions.dragAndDrop(sourceTwo, destTwo).perform();
			Thread.sleep(3000);
			actions.dragAndDrop(sourceThree, destThree).perform();
			actions.dragAndDrop(sourceFour, destFour).perform();
			Thread.sleep(3000);

		}
}
