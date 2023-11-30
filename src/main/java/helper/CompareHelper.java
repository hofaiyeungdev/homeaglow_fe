package helper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompareHelper {

    public static void verifyCurrentUrl(WebDriver driver, String expectedCurrentUrl){
        System.out.println("Current Url = " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "wrong result");
    }

    public static void verifyText(WebDriver driver, String expectedText){

    }
}
