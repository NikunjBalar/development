package com.bridgelabz.appium.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.camera.cameraBase.CameraBaseClass;
import com.appium.camera.camerapage.CameraPage;

public class CameraTeast extends CameraBaseClass{

	
	public CameraPage page;
	
	@BeforeMethod
	public void setup()  {
		try {
			openCamera();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		page = new CameraPage(driver);
	}
	
	@Test
	public void test_Camera() throws InterruptedException {
		Thread.sleep(3000);
		page.cancelPopUP();
		Thread.sleep(2000);
		page.switchCamera();
		Thread.sleep(2000);
		page.openTheam();
		Thread.sleep(2000);
		page.selectTheam();
		Thread.sleep(2000);
		page.takePhoto();

	}
	
	@AfterMethod
	public void tearDown() { 
		driver.close();
		driver.quit();
	}
}
