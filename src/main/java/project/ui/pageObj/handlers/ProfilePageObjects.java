package project.ui.pageObj.handlers;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import project.ui.pageObj.CorePageObjects;

public class ProfilePageObjects extends CorePageObjects {
    /**
         * Stops going for provided seconds
         *
         * @param sec the integer value that is a number of seconds
         * @author Sergey Ocheretko
         */
        public void waitSec(int sec) {
            waitABit(sec * 1000);
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


    }


