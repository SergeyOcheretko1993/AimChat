package project.ui.pageObj;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;



import java.io.File;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Objects;

import static org.apache.commons.io.FileUtils.deleteDirectory;

/**
 * The class contains common methods for working with page elements
 *
 * @author Sergey Ocheretko
 * @version 1.0
 * @since 2020-09-09
 */
public class CorePageObjects extends PageObject  {

    /**
     * Switches to browser's tab by number
     *
     * @param numberOfTab the integer value that is a number of tab
     * @author Sergey Ocheretko
     */
    public void switchToTab(int numberOfTab) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(numberOfTab - 1));
    }

    /**
     * Checks if file was downloaded in the /target/chromedriver_downloads directory.
     * Removes directory after checking
     * true - if file was downloaded,
     * false - if file wasn't downloaded.
     *
     * @author Sergey Ocheretko
     */
    public boolean fileDownloaded() throws IOException {

        String pathToFolder = System.getProperty("user.dir") + "/target/chromedriver_downloads";

        File folder = new File(pathToFolder);

        int count = 0;
        do {
            waitABit(500);
            count++;
        }
        while (!(Objects.requireNonNull(folder.listFiles()).length == 1) && count < 300);

        boolean result = false;
        if (Objects.requireNonNull(folder.listFiles()).length == 1) {
            result = true;
        }
        deleteDirectory(folder);
        return result;
    }

    /**
     * /**
     * Opens a new tab of browser
     *
     * @author Sergey Ocheretko
     */
    public void openNewTab() throws Throwable {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchToTab(2);
    }

    /**
     * Gets url of opened page
     * Returns string that is a url
     *
     * @author Sergey Ocheretko
     */
    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    /**
     * Reloads a page
     *
     * @author Sergey Ocheretko
     */
    public void reloadPage() {
        getDriver().navigate().refresh();
    }

    /**
     * Clicks on browser's back button
     *
     * @author Sergey Ocheretko
     */
    public void clickOnBrowserSBackButton() {
        getDriver().navigate().back();
    }

    /**
     * Stops going for provided seconds
     *
     * @param sec the integer value that is a number of seconds
     * @author Sergey Ocheretko
     */
    public void waitSec(int sec) {
        waitABit(sec * 1000);
    }


    public void scrollToTheTop() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, 0);");
    }


    /**
     * Opens page by url
     *
     * @param url the url of the page to open
     * @author Sergey Ocheretko
     */
    public void goToURL(String url) {
        getDriver().get(url);
    }

    /**
     * Clicks on element by xpath.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Sergey Ocheretko
     */
    public void clickOnElementByXpath(String xpath) {
        boolean staleElement = true;
        while (staleElement) {
            try {
                scrollToElementByXpathUsingJsExecutor(xpath);
                $(xpath).click();
                staleElement = false;
            } catch (StaleElementReferenceException ignored) {
            }
        }
    }


    /**
     * Scrolls to an element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the url of the page to open
     * @author Sergey Ocheretko
     */
    public void scrollToElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", $(xpath));
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Sergey Ocheretko
     */
    public boolean elementByXpathIsVisible(String xpath) {
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Sergey Ocheretko
     */
    public WebElementFacade getElementByXpath(String xpath) {
        return find(By.xpath(xpath));
    }

    /**
     * Returns a text from a web element by id.
     *
     * @param id the string that is an identifier of the element
     * @author Sergey Ocheretko
     */


    /**
     * Removes value from input web element by xpath
     *
     * @param xpath the string that is an identifier of the element
     * @author Sergey Ocheretko
     */
    public void clearInputFieldByXpath(String xpath) {
        find(By.xpath(xpath)).clear();
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param element the web element
     * @param text  the string that is a text to type
     * @author Sergey Ocheretko
     */
    public void typeTextIntoInputFieldByWebElement(WebElementFacade element, String text) {
        waitFor(ExpectedConditions.visibilityOf(element)).typeInto(element, text);
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param value the string that is a path to the element
     * @param text  the string that is a text to type
     * @author Sergey Ocheretko
     */
    public void typeTextIntoInputField(By value, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(value))).typeInto(find(value), text);
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param xpath the string that is a path to the element
     * @param text  the string that is a text to type
     * @author Sergey Ocheretko
     */
    public void typeTextIntoInputFieldByXpath(String xpath, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.xpath(xpath)))).typeInto(find(By.xpath(xpath)), text);
    }

    public void enterInTheLoginField(String login) {
    }

    public class DownloadAndScrollPageObjects extends PageObject {


        /**
         * Switches to browser's tab by number
         *
         * @param numberOfTab the integer value that is a number of tab
         * @author Sergey Ocheretko
         */
        public void switchToTab(int numberOfTab) {
            ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
            getDriver().switchTo().window(tabs.get(numberOfTab - 1));
        }


    }
}



