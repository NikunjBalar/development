package com.bridgelabz.basicsOfSelenium.actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for test ContextClick(Right click) and open link in new window
 * 
 * @author Nikunj Balar
 *
 */
public class ContextClick extends Base{

	//function contain automated script for right click on link 
	public static void contextClick() throws AWTException, InterruptedException {
		driver.get("http://google.com");
		WebElement link=driver.findElement(By.className("gb_g"));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(10000);
	}
}
