package com.omshinde.pages;

import com.omshinde.actions.CommentAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

 //This class represents the Search Result page in the application, extending BasePage for common functionalities.

public class SearchResultPage extends BasePage {

    private WebDriverWait wait;

    // Locator for the comment button on the second post
    @FindBy(xpath = "(//div[contains(@class, 'entity-result__content-container')]//button[contains(@aria-label, 'Comment')])[2]")
    private WebElement commentEle;

    // Locator for the comment input box
    @FindBy(xpath = "//div[@aria-label='Text editor for creating content']")
    private WebElement commentBoxEle;

    //Constructor for SearchResultPage.
    public SearchResultPage(WebDriver webDriver) {
        super(webDriver); // Calls the constructor of the BasePage
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10)); // Initializes the WebDriverWait
    }

}
