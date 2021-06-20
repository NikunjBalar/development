package com.appium.wireless.calculatorPage;

import org.openqa.selenium.support.PageFactory;

import com.appium.wireless.calculatorBase.CalculatorBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorPage extends CalculatorBase {

	@AndroidFindBy(id = "com.android.calculator2:id/digit_0")
	MobileElement zero;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_1")
	MobileElement one;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_2")
	MobileElement two;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_3")
	MobileElement three;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_4")
	MobileElement four;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_5")
	MobileElement five;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_6")
	MobileElement six;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_7")
	MobileElement seven;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_8")
	MobileElement eight;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_9")
	MobileElement nine;

	@AndroidFindBy(id = "com.android.calculator2:id/op_add")
	MobileElement pluse;
	
	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	MobileElement equals;
	
	@AndroidFindBy(id = "com.android.calculator2:id/op_sub")
	MobileElement minus;
	
	@AndroidFindBy(id = "com.android.calculator2:id/op_div")
	MobileElement division;
	
	@AndroidFindBy(id = "com.android.calculator2:id/op_mul")
	MobileElement multiply;
	
	@AndroidFindBy(id = "com.android.calculator2:id/dec_point")
	MobileElement point;
	
	@AndroidFindBy(id = "com.android.calculator2:id/del")
	MobileElement delete;
	
	@AndroidFindBy(id = "com.android.calculator2:id/result")
	MobileElement result;

	public CalculatorPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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

	public void point() {
		point.click();
	}

	public void division() {
		division.click();
	}

	public void delete() {
		delete.click();
	}
	
	public String getResult() {
		String res =result.getText();
		return res;
	}

}
