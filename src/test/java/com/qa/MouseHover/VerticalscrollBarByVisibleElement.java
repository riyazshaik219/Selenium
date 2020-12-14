package com.qa.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerticalscrollBarByVisibleElement {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.linkText("Pinterest"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
}
	}
