package project.steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.ui.xpath_locators.Locators;

import java.io.File;
import java.io.IOException;

public class ProfilePageSteps extends CorePageObjects {

    private ProfilePageSteps profile;

    @And("^Click on the 'arrow' icon on the left top corner$")
    public void clickOnTheArrowIconOnTheLeftTopCorner() {
        profile.clickOnElementByXpath(Locators.ARROW_ICON_USERMENU);

    }
    @And("^Click on the Log out button$")
    public void clickOnTheLogOutButton() {
        profile.clickOnElementByXpath(Locators.LOG_OUT_BUTTON);

        waitABit(2000);
    }

    @And("^Main block is presented$")
    public void mainBlockIsPresented() {
        Assert.assertTrue(
                "Main block is presented",
                profile.elementByXpathIsVisible(Locators.MAIN_BLOCK_MENU));
    }
    @And("^Click on the My Profile link$")
    public void clickOnTheNotificationSettingsLink() {
        profile.clickOnElementByXpath(Locators.MY_PROFILE);
    }

    @And("^Preferences page is opened$")
    public void preferencesPageIsOpened() {
        Assert.assertTrue(
                "Preferences page is opened",
                profile.elementByXpathIsVisible(Locators.PREFERENCES));
    }

    @And("^Click on the Save changes button$")
    public void clickOnTheSaveChangesButton() {
        profile.clickOnElementByXpath(Locators.SAVE_CHANGES_BUTTON);

    }

    @And("^Saved changes alert is displayed$")
    public void savedChangesAlertIsDisplayed() {
        Assert.assertTrue(
                "Saved changes alert is displayed",
                profile.elementByXpathIsVisible(Locators.SAVED_CHANGES_ALERT));
        waitABit(2000);
    }

    @And("^Click on the Back button$")
    public void clickOnTheBackButton() {
        profile.clickOnElementByXpath(Locators.BACK_BUTTON);
    }

    @And("^Clear data in the \"([^\"]*)\" field$")
    public void clearDataInTheField(String data) throws Throwable {
        profile.clearInputFieldByXpath(Locators.FIRST_NAME_FIELD);

    }

    @And("^Enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
    public void enterInTheField(String characters, String data) throws Throwable {
        profile.typeTextIntoInputFieldByXpath(Locators.FIRST_NAME_FIELD, data);
    }

    @And("^Open image$")
    public void openImage() {
        profile.clickOnElementByXpath(Locators.IMAGE);
    }

    @And("^Download a file$")
    public void downloadAFile() {
        profile.clickOnElementByXpath(Locators.DOWNLOAD_BUTTON);
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
