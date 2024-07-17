package omshinde;

import com.omshinde.actions.SearchContent;
import com.omshinde.models.User;
import com.omshinde.pages.HomePage;
import com.omshinde.pages.LoginPage;
import com.omshinde.pages.ProfileHomepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * SearchTest class that contains tests related to the search functionality,
 * extending the BaseTest for setup and teardown functionality.
 */
public class SearchTest extends BaseTest {

    /**
     * Test method to verify that the user can perform a search query successfully.
     */
    @Test
    public void verifyUserIsAbleSearchQuery() {
        // Build user details using the User model
        User user = User.builder().build().user1();

        // Build search content using the SearchContent model
        SearchContent searchContent = SearchContent.builder().build().search();

        // Initialize HomePage and perform sign-in
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().signIn();

        // Log in and navigate to Profile Homepage
        ProfileHomepage profileHomepage = loginPage.login(user);

        // Perform the search query
        profileHomepage.searchQuery(searchContent.getInput());

        // Set up WebDriverWait to wait for the URL to contain the search input
        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(searchContent.getInput()));

        // Assert that the current URL contains the search input
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains(searchContent.getInput()), "URL should contain the search query after searching.");
    }
}
