package com.bridgelabz.basicsOfSelenium.browseroperation;

import java.util.Set;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for close Specified window
 * 
 * @author Nikunj Balar
 *
 */
public class CloseSpecifiedWindow extends Base{
	//Function contain scripts for close specified window 
	public static void close_SpecifiedWindow() throws InterruptedException {
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		String expected_Title="Tech Mahindra";
		// getting all handles of the windows 
		Set<String> allHandles = driver.getWindowHandles();
		// printing number total number of browser windows
		System.out.println("number of windows open in browser = "+ allHandles.size());
		for(String handle : allHandles) {
			Thread.sleep(2000);
			// switch window
			driver.switchTo().window(handle);
			String actual_Title=driver.getTitle();
			Thread.sleep(2000);
			// check for specified window 
			if(actual_Title.equals(expected_Title)) {
				// if current window is specified window than close it
				driver.close();
				// printing title of the specified windows
				System.out.println("main browser window with title "+ actual_Title +"is closed");
			}
			Thread.sleep(4000);
		}
	}

}
