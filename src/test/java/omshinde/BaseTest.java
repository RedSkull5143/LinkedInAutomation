package omshinde;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * BaseTest class that sets up and tears down the WebDriver for each test method,
 * ensuring a clean testing environment for Selenium tests.
 */
public class BaseTest {
    // ThreadLocal to maintain a separate WebDriver instance for each thread
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static final String URL = "https://www.linkedin.com/"; // Base URL for the tests

    /**
     * Sets up the WebDriver before each test method.
     * Initializes the ChromeDriver and maximizes the browser window.
     */
    @BeforeMethod
    public synchronized void setUp() {
        WebDriver webDriver = new ChromeDriver(); // Create a new instance of ChromeDriver
        driverThreadLocal.set(webDriver); // Set the WebDriver instance in ThreadLocal
        launch(); // Launch the application
        driverThreadLocal.get().manage().window().maximize(); // Maximize the browser window
    }

    /**
     * Tears down the WebDriver after each test method.
     * Quits the WebDriver instance to close the browser.
     */
    @AfterMethod
    public synchronized void tearDown() {
        driverThreadLocal.get().quit(); // Quit the WebDriver instance
    }

    /**
     * Launches the specified URL in the WebDriver instance.
     */
    public synchronized void launch() {
        driverThreadLocal.get().get(URL); // Navigate to the base URL
    }

    /**
     * Returns the WebDriver instance associated with the current thread.
     *
     * @return The WebDriver instance for the current thread.
     */
    public synchronized WebDriver getWebDriver() {
        return driverThreadLocal.get(); // Get the WebDriver instance from ThreadLocal
    }
}
