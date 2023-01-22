package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SauceLabDemoLoginPage;

public class SauceLabDemoSteps {

    SauceLabDemoLoginPage sauceLabLoginPage = new SauceLabDemoLoginPage();
    @Given("^I launch the application$")
    public void launchApplication() {
        sauceLabLoginPage.launchApp();
    }

    @When("^Enter Username \"([^\"]*)\" under sauce Lab$")
    public void enterUsername(String username) {
        sauceLabLoginPage.enterUserName(username);
    }

    @Then("^Enter Password \"([^\"]*)\" Under Sauce Lab$")
    public void enterPasswordUnderSauceLab(String password)  {
        sauceLabLoginPage.enterPassword(password);
    }

    @Then("^Click Login button$")
    public void clickLoginButton() {
        sauceLabLoginPage.clickLogin();
    }

    @And("^Verify user is able to enter into homepage successfully$")
    public void verifyUserIsAbleToEnterIntoHomepageSuccessfully() {
        sauceLabLoginPage.verifyUserEnteredIntoAppSuccessfully();
    }

    @And("^Verify Validation message displayed in login page$")
    public void verifyValidationMessageDisplayedInLoginPage() {

    }
}
