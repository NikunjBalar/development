package com.bridgelabz.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bridgelabz.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPOMFramwork {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		LoginPage page = new LoginPage(driver);
		Thread.sleep(3000);
		page.setUserName("nikunj.955888");
		Thread.sleep(3000);
		page.setPassword("topsecreat");
		Thread.sleep(3000);
		page.clickLogin();
		Thread.sleep(3000);
	}
}