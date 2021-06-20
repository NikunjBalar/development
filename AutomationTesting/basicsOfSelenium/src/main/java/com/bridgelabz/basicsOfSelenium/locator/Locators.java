package com.bridgelabz.basicsOfSelenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for test different locators
 * 
 * @author Nikunj Balar
 *
 */
public class Locators extends Base {

	//function contain automated script for different locators
	public static void locators() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		// find element base on id 
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		// send the data to the element
		email.sendKeys("nikunj.955888");
		Thread.sleep(1000);
		// find element base on name
		WebElement pass = driver.findElement(By.name("pass"));
		pass.clear();
		pass.sendKeys("thisissosecreat");
		Thread.sleep(1000);
		// find element base on xpath
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		Thread.sleep(5000);
		// find element base on cssSelector
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
		Thread.sleep(3000);
	}
}
