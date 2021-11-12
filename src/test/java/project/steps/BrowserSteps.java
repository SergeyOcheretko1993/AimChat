package project.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import project.ui.pageObj.CorePageObjects;
import project.utils.PropertyManager;

import java.io.IOException;


public class BrowserSteps extends ScenarioSteps {

    private CorePageObjects core;

    @When("^Open a new tab of browser$")
    public void openANewTabOfBrowser() throws Throwable {
        core.openNewTab();
    }

    @When("^Switch to second tab$")
    public void switchToSecondTab() throws Throwable {
        core.switchToTab(2);
    }

    @When("^Switch to first tab$")
    public void switchToFirstTab() throws Throwable {
        core.switchToTab(1);
    }

    @When("^Wait (\\d+) seconds$")
    public void waitSeconds(int sec) {
        core.waitSec(sec);
    }

    @Given("^Reload page$")
    public void reloadPage() {
        core.reloadPage();
    }

    @When("^Click on browser's Back button$")
    public void clickOnBrowserSBackButton() {
        core.clickOnBrowserSBackButton();
    }

    @Then("^File has been downloaded$")
    public void fileHasBeenDownloaded() throws IOException {
        Assert.assertTrue("file hasn't been downloaded", core.fileDownloaded());
    }

    @Given("^Go to url \"([^\"]*)\"$")
    public void goToUrl(String url) {
        core.goToURL(url);
    }

    @When("^Open google$")
    public void openGoogle() {
        core.goToURL(PropertyManager.getInstance().getUrl());
    }

    @When("^Open yahoo$")
    public void openYahoo() {
        core.goToURL(PropertyManager.getInstance().getUrl2());
    }
}
