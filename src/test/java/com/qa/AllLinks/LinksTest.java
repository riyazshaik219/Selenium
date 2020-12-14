package com.qa.AllLinks;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksTest {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, AWTException {
		 driver=new ChromeDriver();
		driver.get("https://howtodoinjava.com/testng/testng-dependent-tests-examples/");
		driver.manage().window().maximize();
		
	List<WebElement> allinks=driver.findElements(By.tagName("a"));
	System.out.println(allinks.size());
	for(WebElement element:allinks) {
		System.out.println(element.getText()+""+element.getAttribute("href"));
	}
}
}