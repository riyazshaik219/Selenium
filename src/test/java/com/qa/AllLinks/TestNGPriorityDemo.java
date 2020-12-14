package com.qa.AllLinks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	WebDriver driver;
	

	@Test(priority=-9)
	public void testOne() {
		System.out.println("This is my first test case");
	}
	@Test(priority=0)
	public void testTwo() {
		System.out.println("This is my second test case");
	}
}
