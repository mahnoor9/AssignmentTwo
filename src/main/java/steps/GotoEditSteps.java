package steps;

import components.DasboardColView;
import org.openqa.selenium.WebDriver;

public class GotoEditSteps {
    public WebDriver driver;

    public GotoEditSteps (WebDriver driver)
    {
        this.driver= driver;
    }

    public void openEditView(String name)
    {

        driver.findElement (DasboardColView.viewAll).click ();
        driver.findElement (DasboardColView.listOfView (name));
        driver.findElement (DasboardColView.options).click ();
        driver.findElement (DasboardColView.editViewButton).click ();
    }
}
