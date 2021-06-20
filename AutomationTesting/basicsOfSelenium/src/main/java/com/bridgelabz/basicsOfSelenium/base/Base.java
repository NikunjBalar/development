package com.bridgelabz.basicsOfSelenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bridgelabz.basicsOfSelenium.browseroperation.Handling_Browser_Notification;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : For browser initialization 
 * 
 * @author Nikunj Balar
 *
 */
public class Base {

	public static WebDriver driver;

	// static function for chrome initialization
	public static void chromeDriver() {
		// chrome driver setup
		WebDriverManager.chromedriver().setup();
		// handlind browser notification
		ChromeOptions option=Handling_Browser_Notification.disable_Notification();
		// creating instance of chrome driver
		driver = new ChromeDriver(option);
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
}
