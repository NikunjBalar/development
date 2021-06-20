package com.appium.camera.camerapage;

import org.openqa.selenium.support.PageFactory;

import com.appium.camera.cameraBase.CameraBaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CameraPage extends CameraBaseClass {

	@AndroidFindBy(id = "android:id/button2")
	MobileElement cancelPopUp;

	@AndroidFindBy(id = "com.android.camera:id/camera_switch")
	MobileElement switch_Camera;

	@AndroidFindBy(id = "com.android.camera:id/gourmet_watermark")
	MobileElement theam;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View")
	MobileElement select_Theam1;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[1]")
	MobileElement select_Theam2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[2]")
	MobileElement select_Theam3;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[3]")
	MobileElement select_Theam4;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[4]")
	MobileElement select_Theam5;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[5]")
	MobileElement select_Theam6;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[6]")
	MobileElement select_Theam7;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[7]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[7]")
	MobileElement select_Theam8;

	@AndroidFindBy(id = "com.android.camera:id/shutter_button")
	MobileElement take_Photo;

	public CameraPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void cancelPopUP() {
		cancelPopUp.click();
	}

	public void switchCamera() {
		switch_Camera.click();
	}

	public void openTheam() {
		theam.click();
	}

	public void selectTheam() throws InterruptedException {
		select_Theam1.click();
		Thread.sleep(2000);
		select_Theam2.click();
		Thread.sleep(2000);
		select_Theam3.click();
		Thread.sleep(2000);
		select_Theam4.click();
		Thread.sleep(2000);
		select_Theam5.click();
		Thread.sleep(2000);
		select_Theam6.click();
		Thread.sleep(2000);
		select_Theam7.click();
		Thread.sleep(2000);
		select_Theam8.click();
	}

	public void takePhoto() {
		take_Photo.click();
	}
}
