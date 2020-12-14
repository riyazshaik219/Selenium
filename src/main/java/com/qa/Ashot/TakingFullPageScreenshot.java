package com.qa.Ashot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakingFullPageScreenshot {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver = new FirefoxDriver();
		driver.get("https://github.com/riyazshaik219");
		Image_Screenshot("fullpage");
	}
	
	
	public static void Image_Screenshot(String filename) throws IOException {
		
		/*File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile, new File("D:\\Automation\\SeleniumSessions\\Images\\"+filename+".png"));*/
		 
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "PNG", new File("D:\\Automation\\SeleniumSessions\\Images\\"+filename+".png"));
		
	}
	
}
