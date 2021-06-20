package com.bridgelabz.appium.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.wireless.calculatorBase.CalculatorBase;
import com.appium.wireless.calculatorPage.CalculatorPage;

public class WirelessConnectedDeviceTest extends CalculatorBase {

	public CalculatorPage page;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		page = new CalculatorPage();
	}

	@Test
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

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		driver.resetInputState();
	}

}
