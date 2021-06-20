package com.bridgelabz.basicsOfSelenium.popUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : Script for handling java script alert pop up
 * 
 * @author Nikunj Balar
 *
 */
public class AlertAndConfirmation_JavaScripts_PopUp extends Base{

	//Function contains Scripts for handling java script alert pop up
	public static void handling_AlertAndConfirmation_JavaScripts() throws InterruptedException {
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		// switch to alert pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		// handling Confirmation pop up
		// getting text from Confirmation pop up
		System.out.println(alert.getText());
		Thread.sleep(2000);		
		// enter text into pop up
		alert.sendKeys("nikunj");
		Thread.sleep(2000);
		// click on accept(ok) button
		alert.accept();
		Thread.sleep(2000);
		//handling alert pop up
		// getting text from alert pop up
		System.out.println(alert.getText());
		Thread.sleep(2000);
		// click on dismiss(cancel) button
		alert.dismiss();
		Thread.sleep(2000);
	}
}
