package com.bridgelabz.selenium.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.NewsHeadings;

public class TestNewsHeading extends Base {

	NewsHeadings newsHeadings = new NewsHeadings();

	@BeforeTest
	public void setup() {
		chromeDriver();
	}

	@Test
	public void test_GetNews() {
		newsHeadings.getHeadings();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
