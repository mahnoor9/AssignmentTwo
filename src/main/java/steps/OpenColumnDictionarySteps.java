package steps;

import components.SideNavigationBar;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OpenColumnDictionarySteps {
    public WebDriver driver;
    public OpenColumnDictionarySteps(WebDriver driver)
    {
        this.driver= driver;
    }

    public void open()
    {
        driver.findElement (SideNavigationBar.DataCatalogSelect).click ();
        driver.findElement (SideNavigationBar.columnViewButton).click ();
    }
}
