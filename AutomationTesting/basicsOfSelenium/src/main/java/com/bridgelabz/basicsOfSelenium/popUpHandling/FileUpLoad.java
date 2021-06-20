package com.bridgelabz.basicsOfSelenium.popUpHandling;

import org.openqa.selenium.By;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : For file upload Scripts 
 * 
 * @author Nikunj Balar
 *
 */
public class FileUpLoad extends Base {

	// Function contain automated script for file upload operation 
	public static void uploadFile() throws InterruptedException {
		driver.get("https://tus.io/demo.html");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//body/div[@class='wrapper']/div[@class='content']/div[@class='container']/p/input[1]"))
				.sendKeys("C:/Users/Mahadev/Desktop/nikunj.jpg");
		Thread.sleep(3000);
		// find the button base on xpath and click
		driver.findElement(By.xpath("//button[@id='toggle-btn']")).click();
		Thread.sleep(1000);
	}
}
