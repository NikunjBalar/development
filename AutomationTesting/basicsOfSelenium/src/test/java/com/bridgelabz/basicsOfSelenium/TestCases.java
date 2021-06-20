package com.bridgelabz.basicsOfSelenium;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.basicsOfSelenium.HandlingFrame.HandlingFrame;
import com.bridgelabz.basicsOfSelenium.ScrollUpDown.UpDown;
import com.bridgelabz.basicsOfSelenium.actionclass.ContextClick;
import com.bridgelabz.basicsOfSelenium.actionclass.DragAndDrop;
import com.bridgelabz.basicsOfSelenium.actionclass.MouseHover;
import com.bridgelabz.basicsOfSelenium.base.Base;
import com.bridgelabz.basicsOfSelenium.browseroperation.CloseChildWindow;
import com.bridgelabz.basicsOfSelenium.browseroperation.CloseMainBrowserWindow;
import com.bridgelabz.basicsOfSelenium.browseroperation.CloseSpecifiedWindow;
import com.bridgelabz.basicsOfSelenium.browseroperation.Handling_AutoSuggestion;
import com.bridgelabz.basicsOfSelenium.browseroperation.Handling_Browser_Navigation;
import com.bridgelabz.basicsOfSelenium.browseroperation.HiddenAndVisibleLinks;
import com.bridgelabz.basicsOfSelenium.handlingWindowspopUp.Print_windows_handling;
import com.bridgelabz.basicsOfSelenium.handlingWindowspopUp.Upload_Windows_Handling;
import com.bridgelabz.basicsOfSelenium.locator.Locators;
import com.bridgelabz.basicsOfSelenium.popUpHandling.AlertAndConfirmation_JavaScripts_PopUp;
import com.bridgelabz.basicsOfSelenium.popUpHandling.ChildBrowser_PopUp;
import com.bridgelabz.basicsOfSelenium.popUpHandling.Division_PopUp;
import com.bridgelabz.basicsOfSelenium.popUpHandling.FileUpLoad;
import com.bridgelabz.basicsOfSelenium.robotClass.MouseAndKeyboardOperation;
import com.bridgelabz.basicsOfSelenium.screenShot.ScreenShot;
import com.bridgelabz.basicsOfSelenium.selectClass.ListBox;

/**
 * Purpose : To Run the different different test case
 * 
 * @author Nikunj Balar
 *
 */
public class TestCases extends Base {

	// for open browser before every test
	@BeforeMethod
	public void driver() throws InterruptedException {
		// Initialize chrome driver
		chromeDriver();
		Thread.sleep(1000);
	}

	// Function for test takeScreenShot script
	@Test(priority = 1)
	public void takeScreenShot() throws InterruptedException, IOException {
		ScreenShot.takeScreenShot();
	}

	// Function for test browser navigation script
	@Test(priority = 2)
	public void testNavigation() throws InterruptedException {
		Handling_Browser_Navigation.Handling_navigation();
	}

	// Function for test script keyboard and mouse related operation
	@Test(priority = 3)
	public void testKeyBoardRelated_Operation() throws AWTException, InterruptedException {
		MouseAndKeyboardOperation.mouse_Keyboard_Operation();
	}

	// Function for test different locators
	@Test(priority = 4)
	public void testLocators() throws InterruptedException, IOException {
		Locators.locators();
	}

	// Function for test file upload script
	@Test(priority = 5)
	public void test_FileUpload() throws InterruptedException {
		FileUpLoad.uploadFile();
	}

	// Function for test scroll up and down using javaScripsExecutor
	@Test(priority = 6)
	public void test_ScrollUpDown() throws InterruptedException {
		UpDown.upDown_javascript();
		UpDown.downToSpecifyElement_javascript();
	}

	// Function for test frame handling scripts
	@Test(priority = 7)
	public void test_HandlindFrame() throws InterruptedException {
		HandlingFrame.handlingFrame();
	}

	// Function for test ContextClick(Right click) on link
	@Test(priority = 8)
	public void test_ContextClick() throws AWTException, InterruptedException {
		ContextClick.contextClick();
	}

	// Function for test MouseHover scripts
	@Test(priority = 9)
	public void test_MouseHover() throws AWTException, InterruptedException {
		MouseHover.dropDownMenu();
	}

	// Function for test DragAndDrop scripts
	@Test(priority = 10)
	public void test_DragAndDrop() throws InterruptedException {
		DragAndDrop.dragAndDrop();
	}

	// Function for test AlertAndConfirmation_JavaScripts_PopUp scripts
	@Test(priority = 11)
	public void test_AlertAndConfirmation_JavaScripts_PopUp() throws InterruptedException {
		AlertAndConfirmation_JavaScripts_PopUp.handling_AlertAndConfirmation_JavaScripts();
	}

	// function for test Division_PopUp
	@Test(priority = 12)
	public void test_Division_PopUp() throws InterruptedException {
		Division_PopUp.handling_Division_PopUp();
	}

	// Function for test handling child window
	@Test(priority = 13)
	public void test_ChildBrowser_PopUp() throws InterruptedException {
		ChildBrowser_PopUp.handling_ChildBrowser();
	}

	// Function for test script for close main browser window
	@Test(priority = 14)
	public void test_CloseMainBrowserWindow() throws InterruptedException {
		CloseMainBrowserWindow.close_MainWindow();
	}

	// Function for test script for close child windows
	@Test(priority = 15)
	public void test_CloseChildWindow() throws InterruptedException {
		CloseChildWindow.close_ChildWindows();
	}

	// Function for test script for close specified window
	@Test(priority = 16)
	public void test_CloseSpecifiedWindow() throws InterruptedException {
		CloseSpecifiedWindow.close_SpecifiedWindow();
	}

	// Function for test script for get HiddenAndVisibleLinks
	@Test(priority = 17)
	public void test_HiddenAndVisibleLinks() {
		HiddenAndVisibleLinks.get_Hidden_Visible_LinksOfPage();
	}

	// Function for test script for run auto it script for handling print pop up of window
	@Test(priority = 18)
	public void test_Print_windows_handling() throws InterruptedException, AWTException, IOException {
		Print_windows_handling.run_AutoiTScriptForPrint();
	}

	// Function for test script for run auto it script for handling upload file
	@Test(priority = 19)
	public void test_Upload_Windowes_Handling() throws InterruptedException, IOException {
		Upload_Windows_Handling.run_AutoitScriptForUploadFile();
	}

	// Function for test scripts for Handling AutoSuggestion
	@Test(priority = 20)
	public void test_Handling_AutoSuggestion() throws InterruptedException {
		Handling_AutoSuggestion.handling_AutoSuggestion();
	}
	
	// Function for test scripts for select elements from ListBox
	@Test(priority=21)
	public void test_ListBox() throws InterruptedException {
		ListBox.selectElementFromLIstBox();
	}

	// Function for close the browser after every test
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
	}
}
