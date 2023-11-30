package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementHelper {

    public static boolean IsElementDisplay(WebDriver driver, By element){
        return driver.findElement(element).isDisplayed();
    }

    public static void enterText(WebDriver driver, By element, String content){
        driver.findElement(element).sendKeys(content);
    }

    public static void btnClick(WebDriver driver, By element){
        driver.findElement(element).click();
    }
}
