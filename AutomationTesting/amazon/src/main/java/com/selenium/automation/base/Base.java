package com.selenium.automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : to initialize chromeDriver  
 * 
 * @author Nikunj Balar
 *
 */
public class Base {
	
	public static WebDriver driver;
	
	// function initialize chromeDriver
	public static void chromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// wait page to load 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// navigate browser to the given link
		driver.navigate().to("http://amazon.in");
	}
}
