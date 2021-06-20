package com.bridgelabz.hybridFramwork.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bridgelabz.hybridFramwork.base.Base;
import com.bridgelabz.hybridFramwork.configuration.ExcelConfiguration;
import com.bridgelabz.hybridFramwork.module.FaceBookLogin;

/**
 * Purpose : For  
 * 
 * @author Nikunj Balar
 *
 */
public class FaceBookLoginTest extends Base {
	FaceBookLogin faceBookLogin;
	
	// annotation for execute this function before all other function
	@BeforeMethod
	public void setup() {
		// initialize chrome browser
		chromeInitialize();
		faceBookLogin = new FaceBookLogin(driver);
	}
	
	// specify the data provider 
	@Test(dataProvider="loginDetails")
	public void login(String uName , String pass) throws InterruptedException {
		faceBookLogin.setUserName(uName);
		faceBookLogin.setPassword(pass);
		faceBookLogin.clickLogin();
	}
	
	// data provider 
	@DataProvider(name = "loginDetails")
	public Object[][] Details() {
		ExcelConfiguration configiration = new ExcelConfiguration();
		configiration.configExcelSheet("loginDetails.xlsx");
		int row = configiration.size(0);
		Object[][] object = new Object[row][2];
		for (int i = 0; i < object.length; i++) {
			object[i][0] = configiration.getDetails(0, i, 0);
			object[i][1] = configiration.getDetails(0, i, 1);
		}
		return object;
	}
	
	// annotation for execute this function after all function execute
	@AfterMethod
	public void terminate() {
		// to close all the window of the current browser
		driver.quit();
	}

}