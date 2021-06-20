package com.selenium.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.datadriven.configiration.ExcelConfigiration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	@DataProvider(name="facebookLogin")
	public Object[][] loginDetails(){
		ExcelConfigiration configiration= new ExcelConfigiration();
		configiration.configExcelSheet("loginDetails.xlsx");
		int raw =configiration.size(0);
		Object[][] objects = new Object[raw][2];
		for (int i = 0; i < objects.length; i++) {
			objects[i][0]=configiration.getDetails(0, i	, 0);
			objects[i][1]=configiration.getDetails(0, i, 1).toString();
		}
		return objects;
	}
	
	@Test(dataProvider= "facebookLogin")
	public static void facebookLogin(String userName,String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(userName);
		Thread.sleep(3000);

		email.clear();
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys(password);
		Thread.sleep(2000);
		
		email.sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
	}
}
