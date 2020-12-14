package com.qa.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Mousehover {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Manual")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Test Scenario Examples')]")).click();
		
		driver.quit();
}
}