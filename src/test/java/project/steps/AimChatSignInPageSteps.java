package project.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;
import org.aspectj.bridge.IMessage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.Locators;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.io.FileUtils.deleteDirectory;


public class AimChatSignInPageSteps extends ScenarioSteps {

    private CorePageObjects core;


    @Then("^AIMCHAT logo is presented$")
    public void aimchatLogoIsPresented() {
        Assert.assertTrue(
                "AIMCHAT logo is presented",
                core.elementByXpathIsVisible(Locators.AIMCHAT_LOGO)
        );
    }


    @Then("^Enter \"([^\"]*)\" in the Login field$")
    public void enterInTheLoginField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.LOGIN_FIELD, text);
    }

    @Then("^Enter \"([^\"]*)\" in the Password field$")
    public void enterInThePasswordField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.PASSWORD_FIELD, text);

    }

    @Then("^Click on the Sign In button$")
    public void clickOnTheSignInButton() {
        core.clickOnElementByXpath(Locators.SIGNIN_BUTTON);
    }

    @And("^General room logo is presented$")
    public void generalRoomLogoIsPresented() {
        Assert.assertTrue(
                "General room logo is presented",
                core.elementByXpathIsVisible(Locators.GENERAL_ROOM_LOGO)
        );

    }


    @And("^'Your Login or Password is incorrect' alert is displayed$")
    public void yourLoginOrPasswordIsIncorrectAlertIsDisplayed() {
        Assert.assertTrue(
                "Your Login or Password is incorrect' alert is displayed",
                core.elementByXpathIsVisible(Locators.INVALID_LOGIN_OR_PASSWORD)
        );

    }

    @Then("^Click on the 'eye' icon$")
    public void clickOnTheEyeIcon() {
        core.clickOnElementByXpath(Locators.EYE_ICON);

    }

    @Then("^Click on the Forgot your password link$")
    public void clickOnTheForgotYourPasswordLink() {
        core.clickOnElementByXpath(Locators.FORGOT_PASSWORD);
    }

    @Then("^Reset Password page is opened$")
    public void resetPasswordPageIsOpened() {
        core.clickOnElementByXpath(Locators.RESET_PASSWORD_TITLE);

    }

    @Then("^Enter \"([^\"]*)\" in the Reset password field$")
    public void enterInTheResetPasswordField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.RESET_PASSWORD_FIELD, text);

    }

    @And("^Click on the Send Restore Request button$")
    public void clickOnTheSendRestoreRequestButton() {
        core.clickOnElementByXpath(Locators.SEND_REQUEST_BUTTON);

    }

    @And("^Request sent title is presented$")
    public void requestSentTitleIsPresented() {
        Assert.assertTrue(
                "Request sent title is presented",
                core.elementByXpathIsVisible(Locators.REQUEST_SENT_TITLE)
        );
    }

    @And("^Click on the 'arrow' icon on the left top corner$")
    public void clickOnTheArrowIconOnTheLeftTopCorner() {
        core.clickOnElementByXpath(Locators.ARROW_ICON_USERMENU);

    }

    @And("^Click on the Log out button$")
    public void clickOnTheLogOutButton() {
        core.clickOnElementByXpath(Locators.LOG_OUT_BUTTON);

        waitABit(2000);
    }

    @And("^'Login cannot be empty' alert is displayed$")
    public void loginCannotBeEmptyAlertIsDisplayed() {
        Assert.assertTrue(
                "Login cannot be empty' alert is displayed",
                core.elementByXpathIsVisible(Locators.EMPTY_LOGIN_ALERT));
    }


    @And("^'Login should contain from '(\\d+)' to '(\\d+)' characters' alert is displayed$")
    public void loginShouldContainFromToCharactersAlertIsDisplayed(int arg0, int arg1) {
        Assert.assertTrue(
                "Login should contain from '(\\d+)' to '(\\d+)' characters' alert is displayed",
                core.elementByXpathIsVisible(Locators.BOUNDARY_LOGIN_FIELD));
    }

    @And("^'Login contains invalid characters' alert is displayed$")
    public void loginContainsInvalidCharactersAlertIsDisplayed() {
        Assert.assertTrue(
                "Login contains invalid characters' alert is displayed",
                core.elementByXpathIsVisible(Locators.CYRILLIC_SYMBOLS));
    }

    @And("^'Password cannot be empty' alert is displayed$")
    public void passwordCannotBeEmptyAlertIsDisplayed() {
        {
            Assert.assertTrue(
                    "Password cannot be empty' alert is displayed",
                    core.elementByXpathIsVisible(Locators.EMPTY_PASSWORD));
        }
    }

    @And("^'Invalid email address' alert is displayed$")
    public void invalidEmailAddressAlertIsDisplayed() {
        {
            Assert.assertTrue(
                    "Invalid email address' alert is displayed",
                    core.elementByXpathIsVisible(Locators.INVALID_EMAIL));
        }
    }

    @Then("^Click on the 'Send Request' link$")
    public void clickOnTheSendRequestLink() {
        core.clickOnElementByXpath(Locators.SEND_REQUEST);
    }

    @And("^Sign Up page is opened$")
    public void signUpPageIsOpened() {
        Assert.assertTrue(
                "Sign Up page is opened",
                core.elementByXpathIsVisible(Locators.SIGN_UP_TITLE));
    }

    @And("^Click on the Domain name dropdown$")
    public void clickOnTheDomainNameDropdown() {
        core.clickOnElementByXpath(Locators.DOMAIN_NAME_DROPDOWN);
    }

    @And("^Dropdown is opened$")
    public void dropdownIsOpened() {
        Assert.assertTrue(
                "Dropdown is opened",
                core.elementByXpathIsVisible(Locators.LIST_BOX));

    }

    @And("^Enter \"([^\"]*)\" in the 'Email' field$")
    public void enterInTheEmailField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.EMAIL_FIELD, text);
    }

    @And("^Send Restore button should be disabled$")
    public void sendRestoreButtonShouldBeDisabled() {
        Assert.assertTrue(
                "Send Restore button should be disabled",
                core.elementByXpathIsVisible(Locators.DISABLE_SEND_REQUEST_BUTTON));
    }

    @And("^Enter \"([^\"]*)\" in the Username field$")
    public void enterInTheUsernameField(String text) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.USERNAME_FIELD, text);
    }

    @And("^'Username should contain from (\\d+) to (\\d+) characters' alert is displayed$")
    public void usernameShouldContainFromToCharactersAlertIsDisplayed(int arg0, int arg1) {
        Assert.assertTrue(
                "Username should contain from (\\d+) to (\\d+) characters' alert is displayed",
                core.elementByXpathIsVisible(Locators.BOUNDARY_USERNAME_FIELD));
    }

    @And("^'Username contains invalid characters' alert is displayed$")
    public void usernameContainsInvalidCharactersAlertIsDisplayed() {
        Assert.assertTrue(
                "Username should contain from (\\d+) to (\\d+) characters' alert is displayed",
                core.elementByXpathIsVisible(Locators.INVALID_USERNAME));
    }

    @And("^'Check Your Email' title is presented$")
    public void checkYourEmailTitleIsPresented() {
        Assert.assertTrue(
                "Check Your Email' title is presented",
                core.elementByXpathIsVisible(Locators.CHECK_YOUR_EMAIL));
    }

    @And("^Click on the Continue button$")
    public void clickOnTheContinueButton() {
        core.clickOnElementByXpath(Locators.SIGNIN_BUTTON);
    }

    @And("^Click on the Back to sign button$")
    public void clickOnTheBackToSignButton() {
        core.clickOnElementByXpath(Locators.BACK_TO_SIGN);
    }

    @And("^Main block is presented$")
    public void mainBlockIsPresented() {
        Assert.assertTrue(
                "Main block is presented",
                core.elementByXpathIsVisible(Locators.MAIN_BLOCK_MENU));
    }

    @And("^Click on the My Profile link$")
    public void clickOnTheNotificationSettingsLink() {
        core.clickOnElementByXpath(Locators.MY_PROFILE);
    }

    @And("^Preferences page is opened$")
    public void preferencesPageIsOpened() {
        Assert.assertTrue(
                "Preferences page is opened",
                core.elementByXpathIsVisible(Locators.PREFERENCES));
    }


    @And("^Click on the Save changes button$")
    public void clickOnTheSaveChangesButton() {
        core.clickOnElementByXpath(Locators.SAVE_CHANGES_BUTTON);

    }

    @And("^Saved changes alert is displayed$")
    public void savedChangesAlertIsDisplayed() {
        Assert.assertTrue(
                "Saved changes alert is displayed",
                core.elementByXpathIsVisible(Locators.SAVED_CHANGES_ALERT));
        waitABit(2000);
    }


    @And("^Click on the select time zone icon$")
    public void clickOnTheSelectTimeZoneIcon() {
        {
            core.clickOnElementByXpath(Locators.SELECT_TIME_ZONE);
        }
    }

    @And("^Choose another time zone$")
    public void chooseAnotherTimeZone() {
        core.clickOnElementByXpath(Locators.TIME_ZONE);
    }


    @And("^Click on the delete button$")
    public void clickOnTheDeleteButton() {
        core.clickOnElementByXpath(Locators.DELETE_AVATAR_BUTTON);
    }

    @And("^Click on the Back button$")
    public void clickOnTheBackButton() {
        core.clickOnElementByXpath(Locators.BACK_BUTTON);
    }

    @And("^Clear data in the \"([^\"]*)\" field$")
    public void clearDataInTheField(String arg0) throws Throwable {
        core.clearInputFieldByXpath(Locators.FIRST_NAME_FIELD);

    }

    @And("^Enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void enterInTheField(String arg0, String arg1) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.FIRST_NAME_FIELD, arg0);
    }

    @And("^Enter \"([^\"]*)\" in the Last name field$")
    public void enterInTheLastNameField(String arg0) throws Throwable {
        core.clearInputFieldByXpath(Locators.LAST_NAME_FIELD);
    }

    @And("^Click on the 'Change avatar' button$")
    public void clickOnTheChangeAvatarButton() {
        core.clickOnElementByXpath(Locators.BACK_BUTTON);
    }

    @And("^Scroll to the top of the list$")
    public void scrollToTheTopOfTheList() {
        core.clickOnElementByXpath(Locators.CHANGE_AVATAR_BUTTON);
    }


    @And("^Open image$")
    public void openImage() {
        core.clickOnElementByXpath(Locators.IMAGE);
    }

    @And("^Download a file$")
    public void downloadAFile() {
        core.clickOnElementByXpath(Locators.DOWNLOAD_BUTTON);
    }

    @And("^File is downloaded$")
    public static void fileIsExist() {
        File file = new File("C:\\Users\\Lenovo\\Downloads\\IMG_1522.JPG");
        File notExist = new File("xyz.txt");

        try {
            System.out.println(file.getCanonicalPath() + " существует файл? " + file.exists());
            System.out.println(notExist.getCanonicalPath() + " существует файл? " + notExist.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("^Scroll up to the top$")
    public void scrollToTop() {
        core.scrollToTheTop();
    }
}

