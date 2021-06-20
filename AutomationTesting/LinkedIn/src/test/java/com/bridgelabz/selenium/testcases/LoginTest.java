package com.bridgelabz.selenium.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.Login;

/**
 * Purpose : To automate linkedIn application
 * 
 * @author Nikunj Balar
 *
 */
public class LoginTest extends Base {

	public Login login;

	FileReader fileReader;
	Properties properties ;
	

	@BeforeMethod
	public void setup() throws Exception {
		// initialise chrome driver
		chromeDriver();
		login = new Login();
		fileReader = new FileReader("application.properties");
		properties = new Properties();
		properties.load(fileReader);
		Thread.sleep(3000);
	}

	@Test
	public void test_Login() throws InterruptedException {
		System.out.println(properties.getProperty("userName"));
		login.setEmail(properties.getProperty("userName"));
		Thread.sleep(1000);
		login.setPassword(properties.getProperty("password"));
		Thread.sleep(1000);
		// login.signIn();
		Thread.sleep(1000);
		String actual = login.getText();
		login.clickOnAddPhoto();
		System.out.println(actual);
		assertEquals(actual, "Welcome, kunj!");
	}

	@Test
	public void test_negative_Login() throws InterruptedException {
		login.setEmail(properties.getProperty("userName"));
		Thread.sleep(1000);
		login.setPassword("95588");
		Thread.sleep(1000);
		// login.signIn();
		Thread.sleep(1000);
		String actual = login.getNegativeText();
		System.out.println(actual);
		assertEquals(actual, "Welcome Back");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}