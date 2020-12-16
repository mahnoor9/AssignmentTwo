package steps;

import components.DasboardColView;
import components.MarkFav;
import org.openqa.selenium.WebDriver;
import questions.IsFavouriteMarked;

public class MarkAsFavSteps {
    public WebDriver driver;

    public MarkAsFavSteps(WebDriver driver)
    {
        this.driver = driver;
    }
    public void MarkFavstep(String name)
    {
            driver.findElement (DasboardColView.viewAll);
            driver.findElement (DasboardColView.listOfView (name)).click ();
            driver.findElement (MarkFav.favButton).click ();
        }
}
