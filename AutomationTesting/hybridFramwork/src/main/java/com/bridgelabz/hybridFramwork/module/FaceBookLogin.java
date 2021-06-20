package com.bridgelabz.hybridFramwork.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.hybridFramwork.base.Base;

/**
 * Purpose : pom object for login 
 * 
 * @author Nikunj Balar
 *
 */
public class FaceBookLogin extends Base{

	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement loginButton;
	
	public FaceBookLogin(WebDriver driver) {
		System.out.println("invoking "+this.getClass().getSimpleName());
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
}
