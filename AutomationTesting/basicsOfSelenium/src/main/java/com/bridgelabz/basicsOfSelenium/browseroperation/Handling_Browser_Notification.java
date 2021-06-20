package com.bridgelabz.basicsOfSelenium.browseroperation;

import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Purpose : For Handle browser notification 
 * 
 * @author Nikunj Balar
 *
 */
public class Handling_Browser_Notification {

	//function contain automated script for handling browser notification
	public static ChromeOptions disable_Notification() {
		ChromeOptions options=new ChromeOptions();
		// disable notification
		options.addArguments("--disable-notifications");
		return options;
	}
}
