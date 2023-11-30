package stepsDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.homePage.HomePage;

import java.io.FileNotFoundException;

public class HomePageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    public HomePageSteps() throws FileNotFoundException {
    }

    @Given("A new user is visiting Homeaglow home page")
    public void a_new_user_is_visiting_homeaglow_home_page() {
        homePage.openPage();
    }
    @Then("the top menu bar appears at the top of the page")
    public void the_top_menu_bar_appears_at_the_top_of_the_page(){
        Assert.assertTrue(homePage.isMenuDisplayed());
    }



}
