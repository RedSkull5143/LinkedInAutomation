package com.omshinde.pages;

import com.omshinde.models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// This class represents the login page of the application and extends BasePage
public class LoginPage extends BasePage {

    // Locator for the username input field
    @FindBy(id = "username")
    private WebElement username;

    // Locator for the password input field
    @FindBy(id = "password")
    private WebElement password;

    // Locator for the submit button
    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    private WebElement submitBtn;

    // Constructor to initialize the WebDriver
    public LoginPage(WebDriver webDriver) {
        super(webDriver);  // Calls the parent class constructor to initialize the WebDriver and other actions
    }

    // Method to perform login action with the provided User credentials
    public ProfileHomepage login(User user) {
        textBox.type(username, user.getUsername());  // Types the username into the username input field
        textBox.type(password, user.getPassword());  // Types the password into the password input field
        buttonActions.click(submitBtn);  // Clicks the submit button to perform the login
        return new ProfileHomepage(webDriver);  // Returns a new instance of ProfileHomepage after successful login
    }
}
