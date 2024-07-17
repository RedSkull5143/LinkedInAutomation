package com.omshinde.components;

import com.omshinde.pages.BasePage;
import com.omshinde.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// This class represents the header component of the web page and extends BasePage
public class HeaderComponent extends BasePage {

    // Locator for the "Sign in" button
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    private WebElement signInBtn;

    // Constructor to initialize the WebDriver
    public HeaderComponent(WebDriver webDriver) {
        super(webDriver);  // Calls the parent class constructor
    }

    // Method to click the "Sign in" button and navigate to the LoginPage
    public LoginPage signIn() {
        buttonActions.click(signInBtn);  // Clicks the "Sign in" button
        return new LoginPage(webDriver);  // Returns a new instance of LoginPage
    }

}
