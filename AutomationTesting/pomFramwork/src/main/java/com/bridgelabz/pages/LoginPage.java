package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "email")
	private WebElement userName;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(id = "loginbutton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
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