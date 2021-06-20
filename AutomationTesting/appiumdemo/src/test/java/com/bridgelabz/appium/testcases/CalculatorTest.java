package com.bridgelabz.appium.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.calculator.base.Base;
import com.appium.calculator.pages.CalculatorPage;

public class CalculatorTest extends Base {

	public CalculatorPage page;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		page = new CalculatorPage(driver);
	}

	@Test(priority = 1, groups = { "calculator" })
	public void test_Calculator() throws InterruptedException {
		Thread.sleep(500);
		page.one();
		Thread.sleep(500);
		page.pluse();
		Thread.sleep(500);
		page.nine();
		Thread.sleep(500);
		page.equal();
		Thread.sleep(500);
		String result = page.getResult();
		System.out.println("total sum is : " + result);
	}

	@Test(priority = 2, groups = { "calculator" })
	public void test_Calculator2() throws InterruptedException {
		try {
			for (int i = 0; i < 100; i++) {
				page.nine();
				page.equal();
				page.pluse();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}