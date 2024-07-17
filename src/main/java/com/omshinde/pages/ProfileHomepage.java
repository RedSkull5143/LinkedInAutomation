package com.omshinde.pages;

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
     * Constructor for ProfileHomepage.
     *
     * @param webDriver The WebDriver instance used to interact with the browser.
     */
    public ProfileHomepage(WebDriver webDriver) {
        super(webDriver); // Calls the constructor of the BasePage
    }
}
