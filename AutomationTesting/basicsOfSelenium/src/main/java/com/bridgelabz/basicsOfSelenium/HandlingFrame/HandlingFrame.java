package com.bridgelabz.basicsOfSelenium.HandlingFrame;

import org.openqa.selenium.By;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for test Frame Handling
 * 
 * @author Nikunj Balar
 *
 */
public class HandlingFrame extends Base {

	// function contain automated script for frame handling
	public static void handlingFrame() throws InterruptedException {
		driver.get(
				"file:///D:/eclips/JAVA_Eclipse/AutomationTesting/basicsOfSelenium/src/main/java/com/bridgelabz/basicsOfSelenium/HandlingFrame/page2.html");
		// switch to the frame
		driver.switchTo().frame(0);
		// pass the value in text field
		driver.findElement(By.id("t1")).sendKeys("nikunj");
		Thread.sleep(1000);
		// switch to the default(main) page
		driver.switchTo().defaultContent();
		// pass the value in text field
		driver.findElement(By.id("t2")).sendKeys("kunj");
	}
}
