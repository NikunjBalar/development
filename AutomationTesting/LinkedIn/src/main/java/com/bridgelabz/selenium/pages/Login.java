package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.selenium.base.Base;

/**
 * Purpose : Page object model for linkedIn application login test
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class Login extends Base {

	

	@FindBy(id = "username")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	// @FindBy(xpath = "//button[contains(text(),'Sign in')]")
	// WebElement signin;

	@FindBy(xpath = "//span[contains(text(),'Add a photo')]")
	WebElement addPhoto;

//	@FindBy(xpath = "//div[@class='ql-editor ql-blank']//p")
//	WebElement enterText;

	@FindBy(xpath = "//div[text()='Welcome, kunj!']")
	WebElement getText;

	@FindBy(xpath="//h1[contains(text(),'Welcome Back')]")
	WebElement getNegativeText;

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
		this.email.submit();
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
		this.password.submit();
	}

	// public void signIn() {
	// signin.click();
	// }

//	public void addText(String text) {
//		enterText.sendKeys(text);
//	}

	public String getText() {
		String text = getText.getText();
		return text;
	}

	public String getNegativeText() {
		String negativeText = getNegativeText.getText();
		return negativeText;
	}

	public void clickOnAddPhoto() {
		addPhoto.click();
	}
}