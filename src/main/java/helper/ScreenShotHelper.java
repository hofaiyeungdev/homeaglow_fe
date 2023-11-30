package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotHelper {

    public void takeScreenShot(WebDriver driver, By element, String filename) throws IOException {
        File screenshotFile = driver.findElement(element).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("/path/to/save/screenshot.png"));
    }

}
