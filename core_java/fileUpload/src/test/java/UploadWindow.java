import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/*
 *handled upload pop-up using robot class
 */
public class UploadWindow {
    @Test
    public static void uploadWindow() throws AWTException {
        Robot robot=new Robot();
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.id("imagesrc")).click();
        robot.setAutoDelay(2000);
        //to copy to clipboard
        StringSelection stringselection =new StringSelection("E:\\Memories\\lee min hoo");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}