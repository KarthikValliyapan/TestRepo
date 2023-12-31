package com.aiite.dragdrop.mousehover.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignUP
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);

			WebElement signIn = driver.findElement(By.xpath("//span[text() = 'Hello, sign in']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(signIn).perform();
			Thread.sleep(2000);

			WebElement startHere = driver.findElement(By.linkText("Start here."));
			startHere.click();

			WebElement yourName = driver.findElement(By.id("ap_customer_name"));
			yourName.sendKeys("kathik Valliyappan");
			Thread.sleep(2000);

			WebElement yourPhoneNo = driver.findElement(By.id("ap_phone_number"));
			yourPhoneNo.sendKeys("9176468024");
			Thread.sleep(2000);

			WebElement email = driver.findElement(By.id("ap_email"));
			email.sendKeys("ka@gmail.com");
			Thread.sleep(2000);

			WebElement passWord = driver.findElement(By.xpath("//input [@id = 'ap_password']"));
			passWord.sendKeys("123456");
			Thread.sleep(2000);

			WebElement submitButton = driver.findElement(By.xpath("//input [@type = 'submit']"));
			submitButton.submit();
			Thread.sleep(2000);
			driver.close();

		}
}
