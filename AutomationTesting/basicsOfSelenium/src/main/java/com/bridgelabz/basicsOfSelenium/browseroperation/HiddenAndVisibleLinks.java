package com.bridgelabz.basicsOfSelenium.browseroperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.basicsOfSelenium.base.Base;


/**
 * Purpose : to get all hidden and visible link
 * 
 * @author Nikunj Balar
 *
 */
public class HiddenAndVisibleLinks extends Base{

	//Function contain scripts for get all the visible and hidden link 
	public static void get_Hidden_Visible_LinksOfPage() {
		driver.get("http://google.com");
		//return the list of the elements
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		// total number of link 
		int totalLink = allLinks.size();
		System.out.println("total number of links is : "+totalLink);
		int hiddenLinks = 0;
		int visibleLinks = 0;
		for (WebElement link : allLinks) {
			// if the link is displayed than its visible link
			if(link.isDisplayed()) {
				visibleLinks++;
				// printing text of the visible link
				System.out.println("Visible link "+visibleLinks+" ===>> "+link.getText());
			}
			else
				hiddenLinks++;
		}
		System.out.println("total visible links = "+visibleLinks);
		System.out.println("total Hidden links = "+hiddenLinks);
	}
}
