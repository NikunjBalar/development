package com.bridgelabz.basicsOfSelenium.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : For mouse and keyboard operation 
 * 
 * @author Nikunj Balar
 *
 */
public class ScreenShot extends Base{

	// Function contain automated scripts for take a screen shot
	public static void takeScreenShot() throws InterruptedException, IOException {
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		// find element base on id 
		WebElement email=driver.findElement(By.id("email"));
		// send the value to the element
		email.sendKeys("nikunj.955888");
		Thread.sleep(2000);
		// find element base on name
		WebElement password = driver.findElement(By.name("pass"));
		// send the value to the element
		password.sendKeys("test@123");
		Thread.sleep(1000);
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File sorceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("screenshots/loginScreenshot.png");
		FileUtils.copyFile(sorceFile, file);
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
	}
}
