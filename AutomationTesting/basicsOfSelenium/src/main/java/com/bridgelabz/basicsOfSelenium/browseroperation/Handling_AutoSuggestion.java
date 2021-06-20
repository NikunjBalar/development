package com.bridgelabz.basicsOfSelenium.browseroperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;


/**
 * Purpose: For Handle auto suggestion for google.com web page
 *  
 * @author Nikunj Balar
 *
 */
public class Handling_AutoSuggestion extends Base{

	//Function contain scripts for handling auto suggestion 
	public static void handling_AutoSuggestion() throws InterruptedException {
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		System.out.println("Total suggestion : "+suggestions);
		String expected = "selenium interview questions";
		for(WebElement option : suggestions) {
			String text = option.getText();
			if (text.equalsIgnoreCase(expected)) {
				option.click();
				Thread.sleep(2000);
				break;
			}
			Thread.sleep(2000);
		}
	}
}