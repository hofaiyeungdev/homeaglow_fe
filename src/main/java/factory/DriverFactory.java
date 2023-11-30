package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> threadSafeDriver = new ThreadLocal<>();

    public WebDriver init_driver(String browser) {
        System.out.println("browser value is " + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            threadSafeDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadSafeDriver.set(new FirefoxDriver());
        } else if (browser.equals("safari")) {
            WebDriverManager.safaridriver().setup();
            threadSafeDriver.set(new SafariDriver());
        } else {
            System.out.println("Browser setup failed.");
        }

        return getDriver();
    }

    public static synchronized WebDriver getDriver(){
        return threadSafeDriver.get();
    }
}
