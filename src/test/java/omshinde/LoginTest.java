package omshinde;

import com.omshinde.models.User;
import com.omshinde.pages.HomePage;
import com.omshinde.pages.LoginPage;
import com.omshinde.pages.ProfileHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LoginTest class that contains tests related to user login functionality,
 * extending the BaseTest for setup and teardown functionality.
 */
public class LoginTest extends BaseTest {

    /**
     * Test method to verify that the user can log in with valid credentials.
     */
    @Test
    public void verifyUserIsAbleToLoginWithValidCredentials() {
        // Build user details using the User model
        User user = User.builder().build().user1();

        // Initialize HomePage and perform sign-in
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().signIn();

        // Log in and navigate to Profile Homepage
        ProfileHomepage profileHomepage = loginPage.login(user);

        // Assert that the message box is displayed on the Profile Homepage
        Assert.assertTrue(profileHomepage.getMessageBox().isDisplayed(), "Message box should be displayed after login.");
    }
}
