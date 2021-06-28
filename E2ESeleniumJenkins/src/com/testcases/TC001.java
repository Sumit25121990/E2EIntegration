package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {

	@Test
	public void TC_001() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9344167045");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sumit@2512");
		
		
	}
}
