package steps;

import components.OpenEditView;
import org.openqa.selenium.WebDriver;

public class GotoEditSteps {
    public WebDriver driver;

    public GotoEditSteps (WebDriver driver)
    {
        this.driver= driver;
    }

    public void openEditView()
    {
        driver.findElement (OpenEditView.viewAll).click ();
        driver.findElement (OpenEditView.selectSpecific).click ();
        driver.findElement (OpenEditView.editViewButton).click ();
    }
}
