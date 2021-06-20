package com.bridgelabz.basicsOfSelenium.browseroperation;

import java.util.Set;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for close child window
 * 
 * @author Nikunj Balar
 *
 */
public class CloseChildWindow extends Base{
	//Function contain scripts for close child window other than main window
	public static void close_ChildWindows() throws InterruptedException {
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		String main = driver.getWindowHandle();
		// getting all handles of the windows 
		Set<String> allHandles = driver.getWindowHandles();
		// printing number total number of browser windows
		System.out.println("number of windows open in browser = "+ allHandles.size());
		for(String handle : allHandles) {
			Thread.sleep(2000);
			// switch window
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			// check for main window 
			if(!handle.equals(main)) {
				// if current window is not main window than close it
				String title = driver.getTitle();
				driver.close();
				Thread.sleep(2000);
				// printing title of the child windows
				System.out.println("child browser window with title "+ title +"is closed");
			}
			Thread.sleep(2000);
		}
	}
}
