package com.qa.Tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabsDemo {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, AWTException {
		 driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		//Use robot class to press Ctrl+t keys     
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyRelease(KeyEvent.VK_T);
		
		//Switch focus to new tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs);
		driver.switchTo().window(tabs.get(1));
		
		//Launch URL in the new tab
		driver.get("https://artoftesting.com/open-a-new-tab-in-selenium-webdriver-java");
}
}