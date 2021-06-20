package com.bridgelabz.basicsOfSelenium.browseroperation;

import java.util.Set;

import com.bridgelabz.basicsOfSelenium.base.Base;


/**
 * Purpose : Script for close main window
 * 
 * @author Nikunj Balar
 *
 */
public class CloseMainBrowserWindow extends Base{
	//Function contain scripts for close main window other than child window
	public static void close_MainWindow() throws InterruptedException {
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
			if(handle.equals(main)) {
				String title=driver.getTitle();
				// if current window is main window than close it
				driver.close();
				// printing title of the main windows
				System.out.println("main browser window with title "+ title +"is closed");
			}
			Thread.sleep(4000);
		}
	}
}
