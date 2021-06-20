package com.appium.browser.chromeBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeBase {

	public static AppiumDriver<MobileElement> driver;

	public static void openChromeBrowser() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1716");
		capabilities.setCapability(MobileCapabilityType.UDID, "53d40788");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url = new URL("http://127.0.0.1:4722/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, capabilities);
	}

}
