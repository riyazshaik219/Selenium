package com.qa.AddingMethodsToXmlFile;

import org.testng.annotations.Test;

public class AddingMethodsTotestNGFile {

	@Test(priority=0)
	public void FirstMethod() {
		System.out.println("This is my first test case");
	}
	@Test(priority=1)
	public void SecondMethod() {
		System.out.println("This is my second test case");
	}
	@Test(priority=2)
	public void ThirdMethod() {
		System.out.println("This is my third test case");
	}
}
