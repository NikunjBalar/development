package com.appium.calculator.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.calculator.base.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorPage extends Base {
	
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit0")
	MobileElement zero;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit1")
	MobileElement one;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit2")
	MobileElement two;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit3")
	MobileElement three;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit4")
	MobileElement four;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit5")
	MobileElement five;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit6")
	MobileElement six;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit7")
	MobileElement seven;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit8")
	MobileElement eight;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/digit9")
	MobileElement nine;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/plus")
	MobileElement pluse;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/minus")
	MobileElement minus;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/equal")
	MobileElement equals;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/mul")
	MobileElement multiply;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/dot")
	MobileElement dot;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/percent")
	MobileElement percentage;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/div")
	MobileElement division;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/clear1")
	MobileElement clear1;
	@AndroidFindBy(id = "com.android.bbkcalculator:id/clear")
	MobileElement clearall;

	@AndroidFindBy(className = "android.widget.EditText")
	MobileElement result;

	public CalculatorPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	public void zero() {
		zero.click();
	}

	public void one() {
		one.click();
	}

	public void two() {
		two.click();
	}

	public void three() {
		three.click();
	}

	public void four() {
		four.click();
	}

	public void five() {
		five.click();
	}

	public void six() {
		six.click();
	}

	public void seven() {
		seven.click();
	}

	public void eight() {
		eight.click();
	}

	public void nine() {
		nine.click();
	}

	public void equal() {
		equals.click();
	}

	public void pluse() {
		pluse.click();
	}

	public void minus() {
		minus.click();
	}

	public void multiply() {
		multiply.click();
	}

	public void dot() {
		dot.click();
	}

	public void percentage() {
		percentage.click();
	}

	public void division() {
		division.click();
	}

	public void clearAll() {
		clearall.click();
	}

	public void clear1() {
		clear1.click();
	}
	
	public String getResult() {
		String res =result.getText();
		return res;
	}
}
