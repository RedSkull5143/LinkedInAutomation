package omshinde;

import com.omshinde.actions.CommentAction;
import com.omshinde.actions.SearchContent;
import com.omshinde.models.User;
import com.omshinde.pages.HomePage;
import com.omshinde.pages.LoginPage;
import com.omshinde.pages.ProfileHomepage;
import com.omshinde.pages.SearchResultPage;
import omshinde.BaseTest;
import org.testng.annotations.Test;

/**
 * CommentTest class that contains tests related to commenting on posts
 * within the application, extending the BaseTest for setup and teardown functionality.
 */
public class CommentTest extends BaseTest {

    /**
     * Test method to comment on the most recent post displayed
     * based on the search query provided.
     */
    @Test
    public void commentOnRecentPostDisplayedBasedOnQuerySearched() {
        // Build user details using the User model
        User user = User.builder().build().user1();

        // Build search content using the SearchContent model
        SearchContent searchContent = SearchContent.builder().build().search();

        // Build comment action using the CommentAction model
        CommentAction commentAction = CommentAction.builder().build().comment();

        // Initialize HomePage and perform sign-in
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().signIn();

        // Log in and navigate to Profile Homepage
        ProfileHomepage profileHomepage = loginPage.login(user);

        // Search for the query and navigate to SearchResultPage
        SearchResultPage searchResultPage = profileHomepage.searchQuery(searchContent.getInput());

        // Comment on the post using the specified comment action
        searchResultPage.commentOnPost(commentAction.comment());
    }
}
