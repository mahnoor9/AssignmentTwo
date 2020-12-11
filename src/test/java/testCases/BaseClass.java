package testCases;

import components.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import steps.LoginSteps;
import utils.BrowserGetter;
import utils.BrowserWait;
import utils.SplitStringWithComma;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BaseClass {

    public WebDriver driver;
    public StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp()  {
        String s = "a,b,c,d,e,f,g";
        String[] result= SplitStringWithComma.splitString (s);
        for(int i = 0; i< result.length;i++)
        {
            System.out.print (result[i]);
        }
        driver= BrowserGetter.getChromeDriver();
        LoginSteps loginSteps = new LoginSteps (driver);
        loginSteps.login ();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
