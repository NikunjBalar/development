package com.bridgelabz.basicsOfSelenium.popUpHandling;

import java.util.Set;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for handling child browser pop up
 * 
 * @author Nikunj Balar
 *
 */
public class ChildBrowser_PopUp extends Base {

	//Function contains Scripts for handling child browser pop up
	public static void handling_ChildBrowser() throws InterruptedException {
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		// getting all handles of the windows 
		Set<String> allHandles = driver.getWindowHandles();
		// printing number total number of browser windows
		System.out.println("number of windows open in browser = "+ allHandles.size());
		for(String handle : allHandles) {
			Thread.sleep(2000);
			// switch to child window
			driver.switchTo().window(handle);
			// printing title of the windows
			System.out.println("title of window "+ driver.getTitle() +"is :"+handle);
		}
		// close all the windows of the browser
		driver.quit();
	}
}
