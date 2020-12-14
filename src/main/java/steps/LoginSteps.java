package steps;

import components.LoginPage;
import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;

    public LoginSteps(WebDriver driver)
   {
       this.driver = driver;
   }

   public void login()
   {
       System.out.print ("aaaaaaaa");
       driver.get(Constants.URL);
       driver.findElement(LoginPage.email).click();;
       driver.findElement(LoginPage.email).sendKeys(Constants.email);
       driver.findElement(LoginPage.password).click();
       driver.findElement(LoginPage.password).clear();
       driver.findElement(LoginPage.password).sendKeys(Constants.password);
       driver.findElement(LoginPage.loginButton).click();
      // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

}
