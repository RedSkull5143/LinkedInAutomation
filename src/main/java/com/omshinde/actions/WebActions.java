package com.omshinde.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// This class provides common web actions, such as waiting for elements and getting text from elements
public class WebActions {
    protected WebDriver webDriver;  // WebDriver instance to interact with the web page
    protected WebDriverWait webDriverWait;  // WebDriverWait instance for explicit waits

    // Constructor to initialize the WebDriver and WebDriverWait with a 10-second timeout
    public WebActions(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    // Method to get the text from a web element after ensuring it is visible
    public String getText(WebElement element) {
        // Waits until the element is visible, then returns its text
        return webDriverWait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
}
