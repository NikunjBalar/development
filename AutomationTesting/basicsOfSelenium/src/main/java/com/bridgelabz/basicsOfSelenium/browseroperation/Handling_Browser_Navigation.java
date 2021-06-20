package com.bridgelabz.basicsOfSelenium.browseroperation;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : For Handle browser navigation 
 * 
 * @author Nikunj Balar
 *
 */
public class Handling_Browser_Navigation extends Base {

	//function contain automated script for handle browser navigation
	public static void Handling_navigation() throws InterruptedException {
		// navigate to the given link 
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		// navigate to immediate previous page
		driver.navigate().back();
		Thread.sleep(2000);
		// navigate to immediate next page
		driver.navigate().forward();
		Thread.sleep(1000);
		// to refresh the page
		driver.navigate().refresh();
	}
}
