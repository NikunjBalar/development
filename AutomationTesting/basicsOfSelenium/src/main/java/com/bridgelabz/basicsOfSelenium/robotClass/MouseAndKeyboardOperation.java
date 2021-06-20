package com.bridgelabz.basicsOfSelenium.robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : For mouse and keyboard operation 
 * 
 * @author Nikunj Balar
 *
 */
public class MouseAndKeyboardOperation extends Base {

	//function contain automated script for mouse and keyboard operation
	public static void mouse_Keyboard_Operation() throws AWTException, InterruptedException {
		driver.navigate().to("http://google.com");
		WebElement element = driver.findElement(By.name("q"));
		Robot robot = new Robot();
		// key press
		robot.keyPress(KeyEvent.VK_F);
		// key release
		robot.keyRelease(KeyEvent.VK_F);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		Thread.sleep(1000);
		element.submit();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		// move mouse according to x and y coordinate
		robot.mouseMove(500, 500);
		Thread.sleep(1000);
		robot.mouseMove(100, 200);
		Thread.sleep(1000);
		// wheel the mouse for n time
		robot.mouseWheel(20);
		Thread.sleep(3000);

	}
}