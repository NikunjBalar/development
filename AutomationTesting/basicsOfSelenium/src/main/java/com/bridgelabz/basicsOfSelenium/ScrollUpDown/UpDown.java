package com.bridgelabz.basicsOfSelenium.ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : For scroll up and down the selenium web site using
 * javascriptExecutor interface
 * 
 * @author Nikunj Balar
 *
 */
public class UpDown extends Base {

	// function contain automated script for scroll up and down using
	// JavascriptExecutor interface
	public static void upDown_javascript() throws InterruptedException {
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			executor.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		for (int i = 0; i < 10; i++) {
			executor.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
	}

	// function contain automated script for scroll down to specified elements using
	// JavascriptExecutor interface
	public static void downToSpecifyElement_javascript() throws InterruptedException {
		driver.get("http://seleniumhq.org/download");
		WebElement element = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(" + x + ", " + y + ")");
		Thread.sleep(3000);
	}
}