package project.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.pageObj.handlers.ProfilePageObjects;
import project.ui.xpath_locators.Locators;
import project.ui.pageObj.LoginPageObjects;

import java.io.File;
import java.io.IOException;


public class AimChatSignInPageSteps extends ScenarioSteps {

    private CorePageObjects core;
    private LoginPageObjects loginPage;
    private ProfilePageObjects profilePage;

    @Then("^AIMCHAT logo is presented$")
    public void aimchatLogoIsPresented() {
        Assert.assertTrue(
                "AIMCHAT logo is presented",
                core.elementByXpathIsVisible(Locators.AIMCHAT_LOGO)
        );
    }


    @Then("^Enter \"([^\"]*)\" in the Login field$")
    public void enterInTheLoginField(String login) throws Throwable {
        core.enterInTheLoginField(login);
    }

    @Then("^Enter \"([^\"]*)\" in the Password field$")
    public void enterInThePasswordField(String password) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.PASSWORD_FIELD, password);

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
                loginPage.elementByXpathIsVisible(Locators.INVALID_LOGIN_OR_PASSWORD)
        );

    }

    @Then("^Click on the 'eye' icon$")
    public void clickOnTheEyeIcon() {
        loginPage.clickOnElementByXpath(Locators.EYE_ICON);

    }

    @Then("^Click on the Forgot your password link$")
    public void clickOnTheForgotYourPasswordLink() {
        loginPage.clickOnElementByXpath(Locators.FORGOT_PASSWORD);
    }

    @Then("^Reset Password page is opened$")
    public void resetPasswordPageIsOpened() {
        loginPage.clickOnElementByXpath(Locators.RESET_PASSWORD_TITLE);

    }

    @Then("^Enter \"([^\"]*)\" in the Reset password field$")
    public void enterInTheResetPasswordField(String password) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.RESET_PASSWORD_FIELD, password);

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



    @And("^'Login cannot be empty' alert is displayed$")
    public void loginCannotBeEmptyAlertIsDisplayed() {
        Assert.assertTrue(
                "Login cannot be empty' alert is displayed",
                loginPage.elementByXpathIsVisible(Locators.EMPTY_LOGIN_ALERT));
    }


    @And("^'Login should contain from '(\\d+)' to '(\\d+)' characters' alert is displayed$")
    public void loginShouldContainFromToCharactersAlertIsDisplayed(int charactersFrom, int charactersTo) {
        Assert.assertTrue(
                "Login should contain from '(\\d+)' to '(\\d+)' characters' alert is displayed",
                loginPage.elementByXpathIsVisible(Locators.BOUNDARY_LOGIN_FIELD));
    }

    @And("^'Login contains invalid characters' alert is displayed$")
    public void loginContainsInvalidCharactersAlertIsDisplayed() {
        Assert.assertTrue(
                "Login contains invalid characters' alert is displayed",
                loginPage.elementByXpathIsVisible(Locators.CYRILLIC_SYMBOLS));
    }

    @And("^'Password cannot be empty' alert is displayed$")
    public void passwordCannotBeEmptyAlertIsDisplayed() {
        {
            Assert.assertTrue(
                    "Password cannot be empty' alert is displayed",
                    loginPage.elementByXpathIsVisible(Locators.EMPTY_PASSWORD));
        }
    }

    @Then("^Click on the 'Send Request' link$")
    public void clickOnTheSendRequestLink() {
        loginPage.clickOnElementByXpath(Locators.SEND_REQUEST);
    }

    @And("^Sign Up page is opened$")
    public void signUpPageIsOpened() {
        Assert.assertTrue(
                "Sign Up page is opened",
                core.elementByXpathIsVisible(Locators.SIGN_UP_TITLE));
    }


    @And("^Send Restore button should be disabled$")
    public void sendRestoreButtonShouldBeDisabled() {
        Assert.assertTrue(
                "Send Restore button should be disabled",
                core.elementByXpathIsVisible(Locators.DISABLE_SEND_REQUEST_BUTTON));
    }


    @And("^Username contains invalid characters alert is displayed$")
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


    @And("^Enter \"([^\"]*)\" in the Last name field$")
    public void enterInTheLastNameField(String data) throws Throwable {
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

    @And("^Enter \"([^\"]*)\" in the Username field$")
    public void enterInTheUsernameField(String username) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.USERNAME_FIELD, username);
    }

    @And("^'Username should contain from (\\d+) to (\\d+) characters' alert is displayed$")
    public void usernameShouldContainFromToCharactersAlertIsDisplayed(int charactersFrom, int charactersTo) {
        Assert.assertTrue(
                "Username should contain from (\\d+) to (\\d+) characters' alert is displayed",
                loginPage.elementByXpathIsVisible(Locators.BOUNDARY_USERNAME_FIELD));
    }

    @And("^Click on the Back to sign button$")
    public void clickOnTheBackToSignButton() {
        core.clickOnElementByXpath(Locators.BACK_TO_SIGN);
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
    public void enterInTheEmailField(String email) throws Throwable {
        core.typeTextIntoInputFieldByXpath(Locators.EMAIL_FIELD, email);
    }
    @And("^'Invalid email address' alert is displayed$")
    public void invalidEmailAddressAlertIsDisplayed() {
        {
            Assert.assertTrue(
                    "Invalid email address' alert is displayed",
                    loginPage.elementByXpathIsVisible(Locators.INVALID_EMAIL));
        }
    }
    @And("^Click on the 'arrow' icon on the left top corner$")
    public void clickOnTheArrowIconOnTheLeftTopCorner() {
        profilePage.clickOnElementByXpath(Locators.ARROW_ICON_USERMENU);

    }
    @And("^Click on the Log out button$")
    public void clickOnTheLogOutButton() {
        core.clickOnElementByXpath(Locators.LOG_OUT_BUTTON);

        waitABit(2000);
    }

    @And("^Main block is presented$")
    public void mainBlockIsPresented() {
        Assert.assertTrue(
                "Main block is presented",
                profilePage.elementByXpathIsVisible(Locators.MAIN_BLOCK_MENU));
    }
    @And("^Click on the My Profile link$")
    public void clickOnTheNotificationSettingsLink() {
        profilePage.clickOnElementByXpath(Locators.MY_PROFILE);
    }

    @And("^Preferences page is opened$")
    public void preferencesPageIsOpened() {
        Assert.assertTrue(
                "Preferences page is opened",
                profilePage.elementByXpathIsVisible(Locators.PREFERENCES));
    }

    @And("^Click on the Save changes button$")
    public void clickOnTheSaveChangesButton() {
        profilePage.clickOnElementByXpath(Locators.SAVE_CHANGES_BUTTON);

    }

    @And("^Saved changes alert is displayed$")
    public void savedChangesAlertIsDisplayed() {
        Assert.assertTrue(
                "Saved changes alert is displayed",
                profilePage.elementByXpathIsVisible(Locators.SAVED_CHANGES_ALERT));
        waitABit(2000);
    }

    @And("^Click on the Back button$")
    public void clickOnTheBackButton() {
        profilePage.clickOnElementByXpath(Locators.BACK_BUTTON);
    }

    @And("^Clear data in the \"([^\"]*)\" field$")
    public void clearDataInTheField(String data) throws Throwable {
        profilePage.clearInputFieldByXpath(Locators.FIRST_NAME_FIELD);

    }

    @And("^Enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void enterInTheField(String characters, String data) throws Throwable {
        profilePage.typeTextIntoInputFieldByXpath(Locators.FIRST_NAME_FIELD, data);
    }

    @And("^Open image$")
    public void openImage() {
        profilePage.clickOnElementByXpath(Locators.IMAGE);
    }

    @And("^Download a file$")
    public void downloadAFile() {
        profilePage.clickOnElementByXpath(Locators.DOWNLOAD_BUTTON);
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
}






