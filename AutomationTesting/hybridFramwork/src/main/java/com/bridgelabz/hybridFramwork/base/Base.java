package com.bridgelabz.hybridFramwork.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : For initialize browser 
 * 
 * @author Nikunj Balar
 *
 */
public class Base {

	// creating instance of webDriver class
	public static WebDriver driver;
	
	// function to initialize chrome browser
	public static void chromeInitialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(401, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
}
