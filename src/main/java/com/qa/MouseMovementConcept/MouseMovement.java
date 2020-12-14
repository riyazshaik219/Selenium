package com.qa.MouseMovementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseMovement {
WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(7000);
		
	}
	@Test
	public void movementTest() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Covid Insurance')]")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
