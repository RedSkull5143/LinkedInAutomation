package com.omshinde.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

// This class provides actions specific to text box elements, extending from WebActions
public class TextBox extends WebActions {

    // Constructor to initialize the WebDriver
    public TextBox(WebDriver webDriver) {
        super(webDriver);  // Calls the parent class constructor
    }

    // Method to type text into a web element (text box) after ensuring it is visible
    public void type(WebElement element, String input) {
        // Waits until the element is visible, then sends the input text to it
        webDriverWait.until(ExpectedConditions.visibilityOf(element)).sendKeys(input);
    }
}
