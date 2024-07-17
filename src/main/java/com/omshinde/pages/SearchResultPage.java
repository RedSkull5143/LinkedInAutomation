package com.omshinde.pages;

import com.omshinde.actions.CommentAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    //Method to comment on a post using the provided CommentAction.
    public SearchResultPage commentOnPost(CommentAction commentAction) {
        buttonActions.click(commentEle); // Clicks the comment button to open the comment box
        textBox.type(commentBoxEle, commentAction.getInput()); // Types the comment into the comment box

        // Waits for the Post button to be visible and then clicks it
        WebElement postBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Post']")));
        buttonActions.click(postBtn); // Clicks the Post button to submit the comment

        return new SearchResultPage(webDriver); // Returns a new instance of SearchResultPage
    }
}
