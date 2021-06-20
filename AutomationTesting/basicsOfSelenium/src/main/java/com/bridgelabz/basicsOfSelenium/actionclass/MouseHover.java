package com.bridgelabz.basicsOfSelenium.actionclass;

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
public class MouseHover extends Base{

	//function contain automated script for mouse hover to element
	public static void dropDownMenu() throws InterruptedException {
		driver.get("http://www.actimind.com/");
		Thread.sleep(5000);
		WebElement menu=driver.findElement(By.xpath("//a[contains(text(),'ABOUT COMPANY')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Web Crawling")).click();;
		Thread.sleep(5000);
	}
}
