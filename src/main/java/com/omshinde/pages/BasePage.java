package com.omshinde.pages;

import com.omshinde.actions.ButtonActions;
import com.omshinde.actions.TextBox;
import com.omshinde.actions.WebActions;
import com.omshinde.components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// This class serves as the base page for all page classes, providing common functionalities
public class BasePage {
    protected WebActions webActions;  // Instance of WebActions for common web actions
    protected WebDriver webDriver;  // WebDriver instance to interact with the web page
    protected ButtonActions buttonActions;  // Instance of ButtonActions for button-specific actions
    protected TextBox textBox;  // Instance of TextBox for text box-specific actions

    // Constructor to initialize the WebDriver and PageFactory
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;  // Assigns the passed WebDriver instance to the class field
        PageFactory.initElements(webDriver, this);  // Initializes WebElements with PageFactory
        this.textBox = new TextBox(webDriver);  // Initializes TextBox actions
        this.buttonActions = new ButtonActions(webDriver);  // Initializes ButtonActions
        this.webActions = new WebActions(webDriver);  // Initializes WebActions
    }

    // Method to get the HeaderComponent
    public HeaderComponent getHeader() {
        return new HeaderComponent(webDriver);  // Returns a new instance of HeaderComponent
    }
}
