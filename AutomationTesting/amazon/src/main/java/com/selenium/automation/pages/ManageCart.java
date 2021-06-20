package com.selenium.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.automation.base.Base;

/**
 * Purpose : Page object model for amazon application cart test
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class ManageCart extends Base {

	// find different element with different type of locators
	
	@FindBy(name = "field-keywords")
	WebElement searchBox;

	@FindBy(xpath = "//span[contains(text(),'Kohinoor Super Silver Aged Basmati Rice, 5 Kg')]")
	WebElement takeItem1;
	
	@FindBy(xpath = "//span[contains(text(),'SHRILALMAHAL Empire Basmati Rice (Most Premium), 5')]")
	WebElement takeItem2;
	
	@FindBy(name="quantity")
	WebElement manage_quantity;
	
	@FindBy(xpath = "//option[contains(text(),'2')]")
	WebElement selected_Quantity;
	
	@FindBy(xpath = "//input[@name='submit.add-to-cart']")
	WebElement addToCart;
	
	@FindBy (xpath = "//a[@id='nav-cart']")
	WebElement openCart;
	
	@FindBy(xpath = "//input[@value='Delete']")
	WebElement deleteItem;

	// default constructor
	public ManageCart() {
		PageFactory.initElements(driver, this);
	}

	// function to find the search box 
	public void SearchBox(String searchBox) {
		this.searchBox.clear();
		this.searchBox.sendKeys(searchBox);
		this.searchBox.submit();
	}
	
	// function to take a items
	public void TakeItem() {
		takeItem1.click();
		takeItem2.click();
	}
	
	// function to manage the quantity
	public void manage_Quantity() {
		manage_quantity.click();
		selected_Quantity.click();
	}

	// function to add the item into cart
	public void addToCart() {
		addToCart.click();
	}
	
	// function to open the cart
	public void openCart() {
		openCart.click();
	}
	
	// function to deleete the item from cart
	public void deleteItem() {
		deleteItem.click();
	}
}