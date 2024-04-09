package org.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cucumber.pageobject.Orikan;
import org.cucumber.utility.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.cucumber.utility.BaseClass.driver;
import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class StepDefinition_Orikan extends BaseClass {

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

    }

    @Given("Launch the Orikan Website {string}")
    public void Launch_the_Orikan_Website(String URL) throws InterruptedException {
        ok = new Orikan(driver);
        driver.get(URL);
        Thread.sleep(3000);
        Assert.assertTrue(BaseClass.ok.getEmailAddress().isDisplayed());
        System.out.println("Email Address field is displayed");
    }

    @When("Enter the all the fields {string} {string} {string}")
    public void Enter_all_the_fields_and_click_on_next_button(String Email, String Password, String ConfirmPass) {

        ok = new Orikan(driver);
        ok.getEmailAddress().sendKeys(Email);
        ok.getPassword().sendKeys(Password);
        ok.getConfirmPassword().sendKeys(ConfirmPass);
        System.out.println("Details are entered");

    }
    @Then("Validate that Email field is accepting spaces and not throwing any error {string}")
    public void Validate_that_Email_field_is_accepting_spaces_and_not_throwing_any_error(String Email) {
        ok=new Orikan(driver);
        ok.getEmailAddress().sendKeys(Email);
        ok.getEmailAddress().sendKeys(Keys.TAB);
        System.out.println("Email Address field is accepting space and not displaying any error message when tabbed out");

    }
    @And("Validate that the Preferred Full Name field is showing extra space {string} {string}")
    public void Validate_that_the_Preferred_Full_Name_field_is_showing_extra_space(String FirstName, String LastName){
        ok=new Orikan(driver);
        String Actual=ok.getPreFullName().getText();
        String Expected= FirstName+ " " +LastName;

        if(Actual.contains(Expected)){
        System.out.println("No Extra Spaces");
        } else {
            System.out.println("Extra Space is present");

        }
    }

    @And("click on next button")
    public void click_on_next_button() {
        ok = new Orikan(driver);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", ok.getNextButton());

        ok.getNextButton().click();
        System.out.println("Next button is clicked");
    }

    @Then("Scroll down to see the State Dropdown has Repeated values")
    public void Scroll_down_to_see_the_State_Dropdown_has_Repeated_values() {
        ok = new Orikan(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(ok.getFirstName()));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", ok.getStateLabel());

        List<WebElement> options = ok.getStateDropdown();
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (WebElement option : options) {
            String text = option.getText();
            if (!seen.add(text)) {
                duplicates.add(text);
            }
        }
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate options found:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        } else {
            System.out.println("No duplicate options found.");
        }
    }

    @Then("Enter all Mandatory Fields in Contact Page {string} {string} {string} {string} {string} {string}")
    public void Enter_all_Mandatory_Fields_in_Contact_Page(String FirstName, String LastName, String Address1, String Postcode, String City, String State)  {

        ok = new Orikan(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(ok.getFirstName()));
        ok.getFirstName().sendKeys(FirstName);
        ok.getLastName().sendKeys(LastName);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", ok.getAddLine1());


        WebElement Test=fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("addressLine1")));
        Test .click();
        Test.clear();
        Test.sendKeys(Address1);

        ok.getPostCode().sendKeys(Postcode);
        ok.getCity().sendKeys(City);
        Select s=new Select(ok.getState());
        s.selectByVisibleText(State);
        System.out.println("All values are filled");
    }

    @Then("Validate the Card Number field in the Payment page {string}")
    public void Validate_the_Card_Number_field_in_payment_page(String CardNum) {
        ok = new Orikan(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(ok.getCardNumber()));
        Assert.assertTrue(ok.getCardNumber().isDisplayed());
        ok.getCardNumber().sendKeys(CardNum);
        ok.getCardNumber().sendKeys(Keys.TAB);
        System.out.println("Card Number field is accepting more than 16 digits and not throwing error");


    }
    @Then("Validate the CVV field in the Payment page {string}")
    public void Validate_the_CVV_field_in_payment_page(String CVV) {
        ok = new Orikan(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(ok.getCVV()));
        Assert.assertTrue(ok.getCVV().isDisplayed());
        ok.getCVV().sendKeys(CVV);
        ok.getCVV().sendKeys(Keys.TAB);
        System.out.println("CVV field is accepting more than 3 digits and not throwing error");

    }
    @Then("Validate the Card Number CVV and Card Expiry Year field in the Payment page {string} {string} {string}")
    public void Validate_the_Card_Number_CVV_and_Card_Expiry_Year_field_in_the_Payment_page(String CardNum, String CVV, String CardExpYear){
        ok = new Orikan(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(ok.getCVV()));
        Assert.assertTrue(ok.getCVV().isDisplayed());
        ok.getCardNumber().sendKeys(CardNum);
        ok.getCVV().sendKeys(CVV);
        ok.getCardExpYr().sendKeys(CardExpYear);
        ok.getCVV().sendKeys(Keys.TAB);
        System.out.println("Card Number CVV and Card Expiry Year fields are accepting e letter and and not throwing correct error");

    }


    @After
    public void teardown() {

        driver.quit();
    }
}
