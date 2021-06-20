package com.bridgelabz.basicsOfSelenium.popUpHandling;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Purpose : Script for handling FileDownload pop up
 * 
 * @author Nikunj Balar
 *
 */
public class FileDownload {

	@Test
	// Function contain script for handling file download pop up
	public static void handlind_FileDownload() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", "D:/eclips/JAVA_Eclipse/AutomationTesting/appTest");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");

		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='Java']/following-sibling::td/a[.='Download']")).click();
		Thread.sleep(6000);
		driver.close();
	}
}