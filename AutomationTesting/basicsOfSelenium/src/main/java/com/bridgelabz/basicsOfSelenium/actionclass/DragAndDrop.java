package com.bridgelabz.basicsOfSelenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bridgelabz.basicsOfSelenium.base.Base;



/**
 * Purpose : Script for test DragAndDrop
 * 
 * @author Nikunj Balar
 *
 */
public class DragAndDrop extends Base{

	// function contains automated scripts for drag and drop
	public static void dragAndDrop() throws InterruptedException {
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		//target element
		WebElement block1=driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		// source element
		WebElement block2=driver.findElement(By.xpath("//h1[contains(text(),'Block 2')]"));
		Actions actions = new Actions(driver);
		Thread.sleep(6000);
		// drag block2 element and drop it at position of block 1 
		actions.dragAndDrop(block2, block1).perform();
		Thread.sleep(6000);
	}
}
