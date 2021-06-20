package com.bridgelabz.appium.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.browser.chromeBase.ChromeBase;

public class ChromeTest extends ChromeBase{
	
	@BeforeMethod
	public void setup() {
		try {
			openChromeBrowser();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void test_ChromeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("bridgelabz");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
}