package com.bridgelabz.basicsOfSelenium.popUpHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Purpose : Script for handling hidden division pop up
 * 
 * @author Nikunj Balar
 *
 */
public class Division_PopUp {

	// Function contain script for handling hidden division pop up
	public static void handling_Division_PopUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		// disable notification 
		options.addArguments("--disable-notifications");
		// disable location 
		options.addArguments("--disable-geolocation");
		// ignore certificate error 
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
