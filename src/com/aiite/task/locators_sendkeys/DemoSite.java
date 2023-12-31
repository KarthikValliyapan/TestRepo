package com.aiite.task.locators_sendkeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite
{
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			WebElement firstName = driver.findElement(By.xpath("//input [@placeholder = 'First Name']"));
			Thread.sleep(2000);
			firstName.sendKeys("karthik");
			WebElement lastName = driver.findElement(By.xpath("//input [@placeholder = 'Last Name']"));
			Thread.sleep(2000);
			lastName.sendKeys("Valliyappan");
			WebElement address = driver.findElement(By.xpath("//textarea [@ng-model= 'Adress']"));
			Thread.sleep(2000);
			address.sendKeys("Chennai, Tamilnadu");
			WebElement emailId = driver.findElement(By.xpath("//input[@type = 'email']"));
			Thread.sleep(2000);
			emailId.sendKeys("karthik@gmail.com");
			WebElement phone = driver.findElement(By.xpath("//input[@type = 'tel']"));
			Thread.sleep(2000);
			phone.sendKeys("91764680211");
			WebElement password = driver.findElement(By.id("firstpassword"));
			Thread.sleep(2000);
			password.sendKeys("kkkkkk");
			WebElement confirmPassword = driver.findElement(By.id("secondpassword"));
			Thread.sleep(2000);
			confirmPassword.sendKeys("kkkkkk");
			WebElement submit = driver.findElement(By.id("submitbtn"));
			Thread.sleep(2000);
			submit.click();
			WebElement refresh = driver.findElement(By.id("Button1"));
			Thread.sleep(3000);
			refresh.click();
			Thread.sleep(3000);
			driver.close();
		}
}
