package com.bridgelabz.basicsOfSelenium.handlingWindowspopUp;

import java.io.IOException;

import org.openqa.selenium.By;

import com.bridgelabz.basicsOfSelenium.base.Base;

public class Upload_Windows_Handling extends Base{

	public static void run_AutoitScriptForUploadFile() throws InterruptedException, IOException {
		driver.get("https://tus.io/demo.html");
		driver.findElement(By.xpath("//button[@id='toggle-btn']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:/eclips/JAVA_Eclipse/AutomationTesting/basicsOfSelenium/src/main/java/com/bridgelabz/basicsOfSelenium/handlingWindowespopUp/uploadFile.exe");
	}
}
