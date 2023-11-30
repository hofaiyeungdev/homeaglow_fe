/*



*/

package pages.cleanerSignUp;

import helper.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.text.Element;

public class ApplyPage {

    private WebDriver driver;

    //Locators
    private  By btnGetStarted = By.cssSelector("a.btn-primary");
    private  By textZipCodeSalary = By.id("id_zipcode_salary");
    private  By btnSalaryExpectSubmit = By.id("salary_expectation_submit");
    final public String PAGE_URL_GET_STARTED = "https://www.homeaglow.com/apply#get-started";

    /* Locators - Registration Form */
    private By btnPostSalaryExpectSubmit = By.id("post_salary_expectation_submit");
    private By txtFirstName = By.id("id_first_name");
    private By txtLastName = By.id("id_last_name");
    private By txtEmail = By.id("id_email");
    private By txtZipCode = By.id("id_zipcode");


    //Constructor
    public ApplyPage(WebDriver driver){
        this.driver = driver;
    }

    //Page Actions
    public void openPage(){
        String PAGE_URL = "https://www.homeaglow.com/apply";
        driver.get(PAGE_URL);
        System.out.println("From openPage - Apply Page - current Url " +  driver.getCurrentUrl());
    }

    public String getApplyPageTitle(){
        return driver.getTitle();
    }

    public void btnGetStartClick(){
        driver.findElement(btnGetStarted).click();
    }

    public String getZipCodeSalaryText(){
        return driver.findElement(textZipCodeSalary).getText();
    }

    public void enterZipCodeForRate(String zipCode){
        driver.findElement(textZipCodeSalary).sendKeys(zipCode);
    }

    public boolean isTextZipCodeSalaryBlank(){
        return driver.findElement(textZipCodeSalary).getText().isBlank();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public boolean isRegistrationFormDisplayed(){
        return  ElementHelper.IsElementDisplay(driver, txtFirstName) &&
                ElementHelper.IsElementDisplay(driver, txtLastName) &&
                ElementHelper.IsElementDisplay(driver, txtEmail) &&
                ElementHelper.IsElementDisplay(driver, txtZipCode);
    }

    public void SalaryChkEnterZipCode(String zipCode){
        ElementHelper.enterText(driver, textZipCodeSalary , zipCode);
    }

    public void btnSalaryExpectSubmitClick(){
        ElementHelper.btnClick(driver, btnSalaryExpectSubmit);
    }

    public boolean isBtnPostSalaryExpectationSubmitDisplayed(){
        return ElementHelper.IsElementDisplay(driver, btnPostSalaryExpectSubmit);
    }

    public void btnPostSalaryExpectationSubmitClick(){
        //ElementHelper.btnClick(driver, btnPostSalaryExpectSubmit);
        driver.findElement(btnPostSalaryExpectSubmit).click();
    }

    public void registerEnterFirstName(String firstName){
        ElementHelper.enterText(driver, txtFirstName, firstName);
    }
    public void registerEnterLastName(String lastName){
        ElementHelper.enterText(driver, txtFirstName, lastName);
    }
    public void registerEnterEmail(String email){
        ElementHelper.enterText(driver, txtEmail, email);
    }
    public void registerEnterZipCode(String zipCode){
        ElementHelper.enterText(driver, txtZipCode, zipCode);
    }

}
