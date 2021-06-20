package com.bridgelabz.basicsOfSelenium.handlingWindowspopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.bridgelabz.basicsOfSelenium.base.Base;


/**
 * Purpose : To run Auto it script using selenium framework code
 * 
 * @author Nikunj Balar
 *
 */
public class Print_windows_handling extends Base{

	//Function contain script for run Auto it script using selenium framework code
	public static void run_AutoiTScriptForPrint() throws InterruptedException, AWTException, IOException {
		driver.get("http://google.com");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		Runtime run = Runtime.getRuntime();
		run.exec("D:/eclips/JAVA_Eclipse/AutomationTesting/basicsOfSelenium/src/main/java/com/bridgelabz/basicsOfSelenium/handlingWindowespopUp/print.exe");
		Thread.sleep(3000);
	}
}