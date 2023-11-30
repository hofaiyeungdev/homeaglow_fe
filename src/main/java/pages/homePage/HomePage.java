package pages.homePage;

import factory.DriverFactory;
import helper.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    /* The list of elements on the page that would be tracked on page object loading */
    final private By logoLocator = By.cssSelector("img[alt='Homeaglow logo']");
    final private By menuItemLocation = By.cssSelector("a[href='/locations/']");
    final private By menuBecomeACleaner = By.cssSelector(("a[href='/apply']"));
    final private By menuItemGetCleanFor19 = By.cssSelector("a[href='/deal']");
    final private By menuItemCleaningTips = By.cssSelector("a[href='/hub/cleaning-tips']");
    final private By menuItemHelp = By.cssSelector("a[href='/help']");

    public void menuBecomeACleanerClick(){
        driver.findElement(menuItemGetCleanFor19).click();
    }

    // Page Verification
    public boolean isMenuDisplayed() {
        return  ElementHelper.IsElementDisplay(driver,menuItemLocation) &&
                ElementHelper.IsElementDisplay(driver,menuItemGetCleanFor19) &&
                ElementHelper.IsElementDisplay(driver,menuItemCleaningTips) &&
                ElementHelper.IsElementDisplay(driver,menuItemHelp) &&
                ElementHelper.IsElementDisplay(driver,menuBecomeACleaner);
    }

    public void openPage(){
        String PAGE_URL = "https://homeaglow.com";
        driver.get(PAGE_URL);
    }

}
