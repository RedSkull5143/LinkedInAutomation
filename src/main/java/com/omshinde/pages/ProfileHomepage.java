package com.omshinde.pages;

import com.omshinde.actions.SearchContent;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the Profile Homepage page in the application,
 * extending the BasePage for shared functionalities.
 */
public class ProfileHomepage extends BasePage {

    // Locator for the search input box
    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBox;

    // Locator for the message notification badge
    @Getter
    @FindBy(css = ".msg-overlay-bubble-header__badge-container")
    private WebElement messageBox;


    /**
     * Executes a search query in the search box and returns the SearchResultPage.
     *
     * @param input The search query to be executed.
     * @return An instance of SearchResultPage after executing the search.
     */
    public SearchResultPage searchQuery(String input) {
        buttonActions.click(searchBox); // Clicks the search box to focus
        searchBox.sendKeys(input); // Inputs the search query
        searchBox.sendKeys(Keys.RETURN); // Submits the search by pressing Enter
        return new SearchResultPage(webDriver); // Returns the SearchResultPage instance
    }

    /**
     * Constructor for ProfileHomepage.
     *
     * @param webDriver The WebDriver instance used to interact with the browser.
     */
    public ProfileHomepage(WebDriver webDriver) {
        super(webDriver); // Calls the constructor of the BasePage
    }
}
