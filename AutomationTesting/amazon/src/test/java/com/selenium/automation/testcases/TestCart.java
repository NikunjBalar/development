package com.selenium.automation.testcases;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.automation.base.Base;
import com.selenium.automation.pages.ManageCart;

/**
 * Purpose : To automate amazon application cart for add product into cart,change the quantity of the product,delete product from the cart
 * 
 * @author Nikunj Balar
 *
 */
public class TestCart extends Base {

	public ManageCart cart;

	@BeforeMethod
	public void setup() throws InterruptedException {
		// initialise chrome driver
		chromeDriver();
		cart = new ManageCart();
		Thread.sleep(3000);
	}

	@Test
	public void test_Cart() throws InterruptedException {
		Thread.sleep(3000);
		// search for the following argument
		cart.SearchBox("basmati rice 10kg pack");
		Thread.sleep(3000);
		// take a item
		cart.TakeItem();
		Thread.sleep(3000);
		// change the windowes tab
		String parentWindow = driver.getWindowHandle();
		Set<String> windowes = driver.getWindowHandles();
		int size = windowes.size();
		int n = 0;
		for (String window : windowes) {
			n++;
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				Thread.sleep(3000);
				cart.manage_Quantity();
				Thread.sleep(3000);
				cart.addToCart();
				Thread.sleep(3000);
			}
			if (n == size) {
				cart.openCart();
				Thread.sleep(3000);
				cart.deleteItem();
				Thread.sleep(6000);
			}
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
