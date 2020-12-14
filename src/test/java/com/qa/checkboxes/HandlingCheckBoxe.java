package com.qa.checkboxes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingCheckBoxe {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		 driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		element.click();
		if(element.isSelected()) {
			System.out.println("Checkbox is Toggled On");
		}
		else {
			System.out.println("Checkbox is Toggled Off");
		}
		
}
}