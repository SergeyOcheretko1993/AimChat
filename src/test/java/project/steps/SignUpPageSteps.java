package project.steps;

import cucumber.api.java.en.And;

import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.Locators;


public class SignUpPageSteps extends CorePageObjects {

    private SignUpPageSteps signup;

    @And("^Enter \"([^\"]*)\" in the Username field$")
    public void enterInTheUsernameField(String username) throws Throwable {
        signup.typeTextIntoInputFieldByXpath(Locators.USERNAME_FIELD, username);
    }

    @And("^'Username should contain from (\\d+) to (\\d+) characters' alert is displayed$")
    public void usernameShouldContainFromToCharactersAlertIsDisplayed(int charactersFrom, int charactersTo) {
        Assert.assertTrue(
                "Username should contain from (\\d+) to (\\d+) characters' alert is displayed",
                signup.elementByXpathIsVisible(Locators.BOUNDARY_USERNAME_FIELD));
    }

    @And("^Click on the Back to sign button$")
    public void clickOnTheBackToSignButton() {
        signup.clickOnElementByXpath(Locators.BACK_TO_SIGN);
    }
    @And("^Click on the Domain name dropdown$")
    public void clickOnTheDomainNameDropdown() {
        signup.clickOnElementByXpath(Locators.DOMAIN_NAME_DROPDOWN);
    }

    @And("^Dropdown is opened$")
    public void dropdownIsOpened() {
        Assert.assertTrue(
                "Dropdown is opened",
                signup.elementByXpathIsVisible(Locators.LIST_BOX));

    }

    @And("^Enter \"([^\"]*)\" in the 'Email' field$")
    public void enterInTheEmailField(String email) throws Throwable {
        signup.typeTextIntoInputFieldByXpath(Locators.EMAIL_FIELD, email);
    }
    @And("^'Invalid email address' alert is displayed$")
    public void invalidEmailAddressAlertIsDisplayed() {
        {
            Assert.assertTrue(
                    "Invalid email address' alert is displayed",
                    signup.elementByXpathIsVisible(Locators.INVALID_EMAIL));
        }
    }
}