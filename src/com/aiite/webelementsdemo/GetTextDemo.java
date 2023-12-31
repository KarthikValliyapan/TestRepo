package com.aiite.webelementsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo
{
public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTask\\Seleniumtask\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']"));
		WebElement sentence = driver.findElement(By.xpath("//h2"));
		String s = text.getText();
		System.out.println(s);
		System.out.println(sentence.getText());
		driver.close();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement text1 = driver.findElement(By.xpath("(//h2)[15]"));
		String s1 = text1.getText();
		System.out.println(s1);
		WebElement text2 = driver.findElement(By.xpath("//h2[text() = 'Great Indian Festival | Coming soon']"));
		System.out.println(text2.getText());
		driver.close();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		for (int i = 1; i <=25; i++)
			{
				WebElement texts = driver.findElement(By.xpath("(//h2)[" +i+"]"));
				System.out.println(texts.getText());
			}
		driver.close();
	}
}
