package stepsDefinitions;

import factory.DriverFactory;
import helper.ElementHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.cleanerSignUp.ApplyPage;

public class CleanerApplySteps {

    private ApplyPage applyPage = new ApplyPage(DriverFactory.getDriver());

    @Given("User is on the cleaner apply page")
    public void userIsOnTheCleanerApplyPage() {
        applyPage.openPage();
    }
    @Given("User does not provide zip code and clicked on the Get Started button")
    public void user_does_not_provide_zip_code_and_clicked_on_the_get_started_button() {
        // Confirming user has not put in any values into the text box
        Assert.assertTrue(applyPage.isTextZipCodeSalaryBlank());
    }
    @Then("The focus of the page moved to enter zip code for salary rate text box.")
    public void theFocusOfThePageMovedToEnterZipCodeForSalaryRateTextBox() {
        applyPage.btnGetStartClick();
        //Expect the page will be landed on a specific bookmark for the user to fill in zip code.
        Assert.assertEquals(applyPage.getCurrentUrl(), applyPage.PAGE_URL_GET_STARTED);
    }

    @When("User enter a valid zip code {string}")
    public void userEnterAValidZipCode(String zipCode) {
        applyPage.SalaryChkEnterZipCode(zipCode);
        applyPage.btnSalaryExpectSubmitClick();
    }

    @Then("Get Started button will be displayed to the user")
    public void getStartedButtonWillBeDisplayedToTheUser() {
        Assert.assertTrue(applyPage.isBtnPostSalaryExpectationSubmitDisplayed());
    }

    @And("User clicks on the Get Started button")
    public void userClicksOnTheGetStartedButton() {
        applyPage.btnPostSalaryExpectationSubmitClick();
    }

    @Then("The application form to collect user info will be displayed")
    public void theApplicationFormToCollectUserInfoWillBeDisplayed() {
        Assert.assertTrue(applyPage.isRegistrationFormDisplayed());
    }
}
