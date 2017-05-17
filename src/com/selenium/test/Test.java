package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("#masthead-search-term")).sendKeys("java");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#search-btn")).click();
		Thread.sleep(5000);

	}

}
