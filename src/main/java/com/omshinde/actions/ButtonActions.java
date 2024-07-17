package com.omshinde.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

// This class provides actions specific to button elements, extending from WebActions
public class ButtonActions extends WebActions {

    // Constructor to initialize the WebDriver
    public ButtonActions(WebDriver webDriver) {
        super(webDriver);  // Calls the parent class constructor
    }

    // Method to click on a web element after ensuring it is clickable
    public void click(WebElement element) {
        // Waits until the element is clickable, then clicks on it
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
