package testCases;

import constants.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import steps.LoginSteps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BrowserstackTestNG {
    public static final String AUTOMATE_USERNAME = "mahnoor3";
    public static final String AUTOMATE_ACCESS_KEY = "YTENpxbVWZ8knwxsMN5v";
    public static WebDriver driver;
    public StringBuffer verificationErrors = new StringBuffer();
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @BeforeClass(alwaysRun = true)
    public static void setup() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "TestOneEditForm"); // test name
        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
        driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get (Constants.URL);
        LoginSteps loginSteps = new LoginSteps (driver);
        loginSteps.login ();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
    public static void markTestStatus(String status, String reason, WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }



}
