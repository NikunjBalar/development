package com.bridgelabz.basicsOfSelenium.selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bridgelabz.basicsOfSelenium.base.Base;

/**
 * Purpose : for select and deselect element from list box
 * 
 * @author Nikunj Balar
 *
 */
public class ListBox extends Base{

	// Function contain scripts for select and deselect element from list box
	public static void selectElementFromLIstBox() throws InterruptedException {
		driver.get("D:/eclips/JAVA_Eclipse/AutomationTesting/basicsOfSelenium/src/main/java/com/bridgelabz/basicsOfSelenium/selectClass/ListBox_Breakfast.html");
		WebElement list=driver.findElement(By.id("menu"));
		// creating instance of select class
		Select s = new Select(list);
		// getting list of options 
		List<WebElement> options = s.getOptions();
		System.out.println("number of options present inside the select element is : "+options.size());
		//printing the option text
		for (WebElement element : options) {
			String text = element.getText();
			System.out.println(text);
		}
		// option select base on index
		s.selectByIndex(0);
		Thread.sleep(3000);
		// option select base on value
		s.selectByValue("khakhara");
		Thread.sleep(3000);
		//option select base on visible text
		s.selectByVisibleText("THEPLA");
		Thread.sleep(3000);
		//getting list of selected options
		Thread.sleep(3000);
		List<WebElement> selected= s.getAllSelectedOptions();
		System.out.println("Number of selected items : "+selected);
		// printing list of selected element
		for(WebElement element : selected) {
			System.out.println(element.getText());
		}
		// check whether multiple list box are selected or not
		boolean multiple = s.isMultiple();
		
		if (multiple) {
			s.deselectByIndex(0);
			Thread.sleep(3000);
			s.deselectByValue("thepla");
			Thread.sleep(3000);
			s.deselectByVisibleText("KHAKHARA");
			Thread.sleep(3000);
		}
	}
}
