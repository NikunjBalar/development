package com.appium.calculator.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1716");
		capabilities.setCapability(MobileCapabilityType.UDID, "53d40788");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		capabilities.setCapability("appPackage", "com.android.bbkcalculator");
		capabilities.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, capabilities);
	}
}
